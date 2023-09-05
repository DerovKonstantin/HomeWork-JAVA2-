
import Control.ChildrenToysStore;
import Model.DataStorage;
import Model.IdToy;
import Model.Toy;
import Model.Toys;


public class App {
    public static void main(String[] args) throws Exception {

        // Создаем список игрушек
        Toys toys = new Toys();
        // Создаем список призовых игрушек
        Toys prizToys = new Toys();
        // Идентификатор помогает с определением id
        IdToy idToy = new IdToy(toys, prizToys);

        // Создаем наименование игрушек
        Toy toy1 = new Toy(idToy.getNewId(), "Буратино", 2, 0, 10);
        Toy toy2 = new Toy(idToy.getNewId(), "Лиса Алиса", 3, 0, 20);
        Toy toy3 = new Toy(idToy.getNewId(), "Кот Базилио", 4, 0, 30);
        Toy toy4 = new Toy(idToy.getNewId(), "Мальвина", 4, 0, 40);
        Toy toy5 = new Toy(idToy.getNewId(), "Пьеро", 5, 0, 50);
        Toy toy6 = new Toy(idToy.getNewId(), "Пудель Артемон", 7, 0, 60);
        Toy toy7 = new Toy(idToy.getNewId(), "Карабас Барабас", 9, 0, 70);
        Toy toy8 = new Toy(idToy.getNewId(), "Черепаха Тортилла", 7, 0, 80);
        Toy toy9 = new Toy(idToy.getNewId(), "Старый сверчок", 1, 0, 90);
        Toy toy10 = new Toy(idToy.getNewId(), "Шушера", 3, 0, 95);
        Toy toy11 = new Toy(idToy.getNewId(), "Папа карло", 2, 0, 85);
        Toy toy12 = new Toy(idToy.getNewId(), "Золотой ключик", 0, 0, 75);
        Toy toy13 = new Toy(idToy.getNewId(), "Джузеппе", 1, 0, 65);

        // Заполняем список игрушек
        toys.addToy(toy1);
        toys.addToy(toy2);
        toys.addToy(toy3);
        toys.addToy(toy4);
        toys.addToy(toy5);
        toys.addToy(toy6);
        toys.addToy(toy7);
        toys.addToy(toy8);
        toys.addToy(toy9);
        toys.addToy(toy10);
        toys.addToy(toy11);
        toys.addToy(toy12);
        toys.addToy(toy13);

        // Сохраняем всю информацию по игрушкам в файлах "toyStor.dat" и "toyPriz.dat"
        DataStorage dataStor = new DataStorage("toyStor.dat", toys);
        dataStor.saveToys();
        DataStorage dataPriz = new DataStorage("toyPriz.dat", prizToys);
        dataPriz.saveToys();
        
        // Запускаем логику программы
        ChildrenToysStore сhildrenToysStore = new ChildrenToysStore(toys, prizToys);
        сhildrenToysStore.runToysStore();
    }

}