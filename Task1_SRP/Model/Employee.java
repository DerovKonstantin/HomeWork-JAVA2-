package Task1_SRP.Model;

import java.util.Date;

/** 
 * Класс - Сотрудник
 * @author --
 * @version 1.0
*/
public class Employee {
    /** поле - имя сотрудника */
    private String name;
    /** поле - дата рождения (date of birth)*/
    private Date dob;
    //private int baseSalary;
        
    /**
    * Конструктор - создание нового объекта (Сотрудник)
    * @param name - имя сотрудника
    * @param dob - дата рождения (date of birth)
    */
    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    /**
    * Получение значения - имя и дата рождения сотрудника в виде строки
    */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
