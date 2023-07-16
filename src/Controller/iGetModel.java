package Controller;

import java.util.List;

import Model.Student;

/** 
 * Интерфейс - получить модель (получение списка студентов и характеристик / удаление)
 * @author --
 * @version 1.0
*/
public interface iGetModel {
    
    /**
     * Метод - получение списка студентов и характеристик
     */
    public List<Student> getAllStudents();

    /**
     * Метод - удаления студентов
     * @param id - идентификатор студента
     */
    public void delStudents();

    
    
}
