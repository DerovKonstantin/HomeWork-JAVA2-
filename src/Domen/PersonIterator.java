package Domen;

import java.util.List;

import java.util.Iterator;

/** 
 * Обобщенный класс Iterator людей, использует интерфейс Iterator
 * @author Деров Контантин
 * @version 1.0
*/
public class PersonIterator<T extends Person> implements Iterator<T> {
    /** поле счетчик */
    private int counter;
    /** поле списо людей */
    private final List<T> T;

    /**
     * Конструктор - создание нового объекта (список людей)
     * @param List<T> T - обобщенный параметр (список людей)
     */
    public PersonIterator(List<T> T) {
        this.T = T;
        this.counter = 0;
    }
    @Override
    public boolean hasNext() {
        if(counter < T.size()){
            return true;
        }
        else{
            return false;
        }            
    }
    @Override
    public T next() {            
        return T.get(counter++);
    }
}
