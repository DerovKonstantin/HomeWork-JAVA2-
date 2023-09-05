package Control;

import Model.Toy;
import Model.Toys;

/** 
 * Класс - Розыгрыш игрушек
 * @author --
 * @version 1.0
*/
public class PlayOutToys {

    /** поле - класс - список игушек */
    private Toys toys;
    /** поле - класс - список призовых игушек */
    private Toys prizToys;

    /**
     * Конструктор - создание нового объекта (Розыгрыш игрушек)
     * @param toys - список игушек
     * @param prizToys - список призовых игушек
     */
    public PlayOutToys(Toys toys, Toys prizToys) {
        this.toys = toys;
        this.prizToys = prizToys;
    }

    /**
     * Метод - редактирование частты(%) выпадения игрушки
     * @param id - идентификатор игрушки
     * @param dropChance частота выпадения игрушки
     */
    public void redactToyDropChance(int id, int dropChance) {
        for (Toy toy : toys.getAll()) {
            if (toy.getId() == id) {
                toy.setDropChance(dropChance);
                break;         
            }
        }
    }

    /**
     * Метод - запускает розыгрыш игрушек, заполняет список призовых игрушек
     */
    public void playToys() {
        int prizeDropChance = (int) ( 1 + Math.random() * 100 );
        System.out.printf("Вроятность выпадения призовых игрушк составляет %d процента !...\n", prizeDropChance);
        for (Toy toy : toys.getAll()) {
            if ( prizeDropChance <= toy.getDropChance() & toy.getQuantity() > toy.getNumberOfPrize() ) {
                prizToys.addToy(toy);
                toy.setNumberOfPrize(toy.getNumberOfPrize()+1);
            }
        }
    }

}