package Domen;

import java.util.Iterator;
import java.util.List;


/** 
 * Обобщенный класс подсчета среднего возраста людей (студентов, учителей и работников)
 * @author Деров Константин
 * @version 1.0
*/
public class AverageAge<T extends Person> implements Iterable<T>  {
    /** поле среднии возраст людей */
    private int res;
    /** поле список людей */
    private final List<T> T;


    /**
     * Конструктор - создание нового объекта (список людей)
     * @param List<T> T - обобщенный параметр (список людей)
     */
    public AverageAge(List<T> T) {
        this.T = T;
        this.res = 0;
        
    }

    @Override
    public Iterator<T> iterator() {
        return new PersonIterator(T);
    }


    @Override
    public String toString() {
        for( Person person : T){
            res += person.getAge();
        }
        // for (int i = 0; i < T.size(); i++){
        //     res += T.get(i).getAge();
        // }
        res /= T.size();
        StringBuilder string_builder = new StringBuilder();
        string_builder.append("Среднии возраста людей = ");
        string_builder.append(res);
        return  string_builder.toString();
    }


    
}
