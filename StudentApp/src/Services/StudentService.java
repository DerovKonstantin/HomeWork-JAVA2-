package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Student;

/** 
 * Класс табель учета студентов, использует интерфейс табель учета людей
 * @author --
 * @version 1.0
*/
public class StudentService implements iPersonService<Student> {
    /** поле счетчик */
    private int count;
    /** поле список студентов */
    private List<Student> students;

    /**
     * Конструктор - создание нового объекта (список студентов)
     */
    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, int age) {
        Student per = new Student(firstName,age,count);
        count++;
        students.add(per);
    }    

    /**
     * метод сортирет студентов по имени
     */
    public void sortByFIOStdLst()
    {
       // List<Student> newStudentList = new ArrayList<Student>(students);
        students.sort( new PersonComparator<Student>());
        //return newStudentList;
    }


}
