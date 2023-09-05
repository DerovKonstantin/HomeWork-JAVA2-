package Model;

import java.io.Serializable;

import java.util.HashSet;
import java.util.Set;

/** 
 * Класс идентификатор игрушки (Список всех id)
 * @author --
 * @version 1.0
*/
public class IdToy implements Serializable {

    /** поле - набор используемых идентификаторов */
    Set<Integer> idSet;

    /**
     * Конструктор - создание нового объекта (идентификатор игрушки)
     * @param toys - список игушек
     * @param prizToys - список призовых игушек
     */
    public IdToy(Toys toys, Toys prizToys){
        this.idSet = new HashSet<>();
        for (Toy toy : toys.getAll()) {
            idSet.add((int) toy.getId());
        }
        for (Toy toy : prizToys.getAll()) {
            idSet.add((int) toy.getId());
        }
    }

    /**
     * Метод - новый уникальный идентификатор игрушки
     */
    public int getNewId() {
        int randomid = (int) ( 100000 + Math.random() * 10000 );
        while ( idSet.contains(randomid) ) {
            randomid = (int) ( 100000 + Math.random() * 10000 );
        }
        idSet.add(randomid);
        return randomid;
    }

    /**
     * Метод - проверка совпадений идентификационного номера
     */
    public boolean сheckId(int id) {
        for (int toy : idSet) {
            System.out.println(toy);
        }
        if ( idSet.contains(id)){
            return true;
        }
        return false;
    }

    /**
     * Функция получения значения поля - набор используемых идентификаторов
     */
    public Set<Integer> getAll() {
        return this.idSet;
    }

}
