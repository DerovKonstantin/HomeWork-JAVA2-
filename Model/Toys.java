package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/** 
 * Класс список игушек, использует интерфейс Сериализация (Serialization)
 * @author --
 * @version 1.0
*/
public class Toys implements Serializable {

    /** поле - список игрушек */
    private List<Toy> toys;

    /**
     * Конструктор - создание нового объекта (список игушек)
     */
    public Toys(){
        this.toys = new ArrayList<>();
    }

    /**
     * Метод - добавление новой игрушки в список
     * @param toy - новая игрушка
     */
    public void addToy(Toy toy){
        this.toys.add(toy);
    }

    /**
     * Функция получения значения поля - список игрушек
     */
    public List<Toy> getAll() {
        return toys;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список игрушек...\n");
        for (Toy toy : toys) {
            sb.append("   id-");
            sb.append(toy.getId());
            sb.append(", название-");
            sb.append(toy.getName());
            sb.append(", частота выпадения игрушки-");
            sb.append(toy.getDropChance());
            sb.append(".\n");
        }
        sb.append("   ...");
        return sb.toString();
    }

}
