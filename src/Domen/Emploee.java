package Domen;

/** 
 * Класс сотрудник, наследник класса человек
 * @author --
 * @version 1.0
*/
public class Emploee extends Person{
    /** поле должность */
    private String special;

    /**
     * Конструктор - создание нового объекта (сотрудник)
     * @param firstName - имя сотрудник
     * @param age - возраст сотрудник
     * @param special - должность
     */
    public Emploee(String firstName, int age, String special) {
        super(firstName, age);
        this.special = special;
    }
}
