package Controllers;

import Domen.Student;
import Services.StudentService;

/** 
 * Класс контроля и регистрации студентов в базе данных, использует интерфейс контроля и регистрации людей
 * @author --
 * @version 1.0
*/
public class StudentController implements iPersonController<Student> {
    private final StudentService dataService = new StudentService();

    //Метод регистрации студената в базе данных
    @Override
    public void create(String firstName, int age) {
        dataService.create(firstName,age);
        dataService.sortByFIOStdLst();
    }

}