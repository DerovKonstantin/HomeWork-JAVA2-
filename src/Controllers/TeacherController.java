package Controllers;

import Domen.Person;
import Domen.Teacher;
import Services.TeacherService;

/** 
 * Класс контроля и регистрации учителей в базе данных, использует интерфейс контроля и регистрации людей
 * @author --
 * @version 1.0
*/
public class TeacherController implements iPersonController<Teacher>  {
    private final TeacherService dataService = new TeacherService();

    @Override
    public void create(String firstName, int age) {
        dataService.create(firstName, age);
        dataService.sortByFIOTchrLst();
        
    }

    @Override
    public String toString() {
        StringBuilder string_builder = new StringBuilder();
        string_builder.append("\nРегистрации учителей в базе данных:\n");
        for(Teacher teacher : dataService.getAll())
        {
            string_builder.append("\t");
            string_builder.append("Имя - ");
            string_builder.append(teacher.getName());
            string_builder.append(", возраст - ");
            string_builder.append(teacher.getAge());
            string_builder.append("\n");
        }
        return string_builder.toString();
    }

}
