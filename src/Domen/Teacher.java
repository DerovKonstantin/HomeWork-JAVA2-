package Domen;

/** 
 * Класс учитель, наследник класса человек
 * @author --
 * @version 1.0
*/
public class Teacher extends Person{
    /** поле ученая степень */
    private String acadDegree;

    /**
     * Конструктор - создание нового объекта (человек)
     * @param firstName - имя учителья
     * @param age - возраст учителья
     * @param acadDegree - ученая степень
     */
    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }
}
