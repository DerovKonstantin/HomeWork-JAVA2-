package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Teacher;

/** 
 * Класс табель учета учителей, использует интерфейс табель учета людей
 * @author Деров Константин
 * @version 1.0
*/
public class TeacherService implements iPersonService<Teacher> {
    /** поле ученая степень */
    private String acadDegree;
    /** поле список учетилей */
    private List<Teacher> teachers;

    /**
     * Конструктор - создание нового объекта (список студентов)
     */
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, int age) {
        Teacher per  = new Teacher(firstName,age,acadDegree);
        acadDegree = "";
        teachers.add(per);
    }    

    /**
     * метод сортирет учителей по имени
     */
    public void sortByFIOTchrLst()
    {
        teachers.sort( new PersonComparator<Teacher>());
    }
    
}
