package Services;

import java.util.List;

/** 
 * интерфейс табель учета людей
 * @author --
 * @version 1.0
*/
public interface iPersonService<T> {
    /**
     * Получения списка людей (Учителя, студенты, сотрудники)
     */
    List<T> getAll();

    /**
     * Создание списка людей (Учителя, студенты, сотрудники)
     */
    void create(String firstName, int age); 
}
