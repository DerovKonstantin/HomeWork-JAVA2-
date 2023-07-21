package Task1_SRP.Model;

/** 
 * Класс - Зарплата(корректировка заработной платы)
 * @author --
 * @version 1.0
*/
public class Salary {
    /** поле - базовая зарплата */
    private int baseSalary;

    /**
        * Конструктор - создание нового объекта (Зарплата)
        * @param baseSalary - базовая зарплата
        */
    public Salary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    /**
     * Метод - производит расчет чистой заработной платы
     */
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);
        return baseSalary - tax;
    }
    
}
