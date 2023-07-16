package Controller;

import java.util.List;

import Model.Student;

/** 
 * Интерфейс - получить вид (набор методов для отображения списка студентов и их характерисик)
 * @author --
 * @version 1.0
*/
public interface iGetView {

    /**
     * Метод - выводит на печать список всех студентов
     * @param students - список студентов
     */
    void printAllStudents(List<Student> students);

    /**
     * Метод - для запроса ввода пользователя, чтобы получить команду или данные от него
     * @param msg - запроса ввода пользователя
     */
    String prompt(String msg);
//-------------------------------------------------------

    // Метод выводит информацию о каждом студенте на консоль
    void printAllStudent(List<Student> students);

    // Метод для получения id студента, которого нужно удалить.
    Long getStudentIdToDelete();

    // Метод отображает информацию о каждом студенте
    void displayStudents(List<Student> students);

    // Метод для чтения данных о студенте.
    Student readStudent();

    // Метод для получения id студента, которого пользователь хочет обновить.
    Long getStudentIdToUpdate();
    
}

// import java.util.List;
// import Model.Student;

// /**
//  * Интерфейс для создания блока view в модели MVC
//  */
// public interface iGetView {
//     // Метод выводит информацию о каждом студенте на консоль
//     void printAllStudent(List<Student> students);

//     // Метод для запроса ввода пользователя, чтобы получить команду или данные от него
//     String prompt();

//     // Метод для получения id студента, которого нужно удалить.
//     Long getStudentIdToDelete();

//     // Метод отображает информацию о каждом студенте
//     void displayStudents(List<Student> students);

//     // Метод для чтения данных о студенте.
//     Student readStudent();

//     // Метод для получения id студента, которого пользователь хочет обновить.
//     Long getStudentIdToUpdate();
// }