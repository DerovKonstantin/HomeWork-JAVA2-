package Control;

import java.util.Scanner;

import Model.CheckInput;
import Model.DataStorage;
import Model.IdToy;
import Model.Toy;
import Model.Toys;

/** 
 * Класс - магазин детских товар
 * @author --
 * @version 1.0
*/
public class ChildrenToysStore {
    
    /** поле - класс - список игушек */
    private Toys toys;
    /** поле - класс - список призовых игушек */
    private Toys prizToys;
    /** поле - класс - хранение данных списка игушек */
    private DataStorage dataStor;
    /** поле - класс - хранение данных списка призовых игушек */
    private DataStorage dataPriz;
    /** поле - класс - идентификатор игрушки (создание новых уникальных идентификаторов) */
    private IdToy idToy;
    /** поле - класс - проверка корректности ввода */
    private CheckInput checkInput;
    /** поле - класс - розыгрыш игрушек */
    private PlayOutToys playOutToys;
    
    /**
     * Конструктор - создание нового объекта (Магазин детских товар)
     */
    public ChildrenToysStore(Toys toys, Toys prizToys) {
        this.toys = toys;
        this.prizToys = prizToys;
        this.idToy = new IdToy(toys, prizToys);
        this.dataStor = new DataStorage("toyStor.dat", toys);
        this.dataPriz = new DataStorage("toyPriz.dat", prizToys);
        this.checkInput  = new CheckInput();
        this.playOutToys = new PlayOutToys(toys, prizToys);
    }

    /**
     * Метод - запускает цикл ввода команд магазина детских игрушек
     */
    public void runToysStore()
    {
        boolean go = true;
        while(go)
        {
            System.out.print("Введите команду...\n" +
            "   0) Выход\n" +
            "   1) Список товаров\n" +
            "   2) Список призовых товаров\n" +
            "   3) Загрузить списки товаров из памяти\n" +
            "   4) Добавление новой игрушки в список товаров\n" +
            "   5) Изменение частоты выпадения игрушки\n" +
            "   6) Запуск розыгроша игрушек\n" +
            "...");
            Scanner input = new Scanner(System.in);
            int numCommandToysStore = input.nextInt();
            switch(numCommandToysStore)
            {
                case 0:
                    go = false;
                    System.out.println("Выход из программы \"Магазин детских игрушек!\"...");
                    break;
                case 1:
                    System.out.println(toys.toString());
                    break;
                case 2:
                    System.out.println(prizToys.toString());
                    break;
                case 3:
                    this.toys = dataStor.loadToys();
                    this.prizToys = dataPriz.loadToys();
                    this.idToy = new IdToy(toys, prizToys);
                    break;
                case 4:
                    System.out.println("Добавление новой игрушки в список товаров...");
                    String nameToy = checkInput.NameToy("Введите название новой игрушки...");
                    int dropChance = checkInput.DropChance("Введите число определяющее частоту выпадения игрушки (вес в % от 1 до 100)...");
                    toys.addToy(new Toy(idToy.getNewId(), nameToy, toys.getAll().size()+1, prizToys.getAll().size(), dropChance));
                    dataStor.saveToys();
                    break;
                case 5:
                    System.out.println("Изменение частоты выпадения игрушки...");
                    System.out.println(toys.toString());
                    int id = checkInput.id("Введите идентификацилнный номер(id) игрушки из перечисленных выше...", idToy);
                    int newdropChance = checkInput.DropChance("Введите число определяющее новую частоту выпадения игрушки (вес в % от 1 до 100)...");
                    playOutToys.redactToyDropChance(id, newdropChance);
                    break;
                case 6:
                    boolean end = true;
                    while (end){
                        System.out.println("Ррозыгрыш игрушек запущен...");
                        playOutToys.playToys();
                        System.out.print("Призовые игрушки! ");
                        System.out.println(prizToys.toString());
                        System.out.print("Введите команду...\n" +
                        "   0) Выход\n" +
                        "   1) Запустить розыгрыш повторно\n" +
                        "   2) Забрать призовые игрушки\n" +
                        "...");
                        int numCommandPlayOutToys = input.nextInt();
                        switch(numCommandPlayOutToys)
                        {
                            case 0:
                                System.out.println("Ррозыгрыш игрушек остановлен...");
                                end = false;
                                break;
                            case 1:
                                break;
                            case 2:

                                System.out.println("Вы забрали все призовые игрушки...");
                                for (Toy toy : prizToys.getAll()) {
                                    if ( idToy.сheckId((int)toy.getId())  ) {
                                        idToy.getAll().remove((int)toy.getId());
                                        toy.setQuantity(toy.getQuantity() - toy.getNumberOfPrize());
                                    }
                                }
                                end = false;
                                break;
                            default:
                                System.out.println("Операция не распознана. Повторите ввод...");
                        }
                    }
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод...");
            }
        }
    }  
    
}
