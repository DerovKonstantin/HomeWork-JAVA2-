package Task2_OCP.Model;

/** 
 * Класс - Транспортное средство
 * @author --
 * @version 1.0
*/
public class Vehicle {
    /** поле - максимальная скорость*/
    int maxSpeed;
    /** поле - тип*/
    String type;

    /**
     * Конструктор - создание нового объекта (Транспортное средство)
     * @param maxSpeed - максимальная скорость
     * @param type - тип
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    /**
     * Получение значения поля - максимальная скорость
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Получение значения поля - тип
     */
    public String getType() {
        return this.type;
    }

    /**
     * Метод - рассчитывает допустимую скорость
     */
    public double calculateAllowedSpeed() {
        return 0.0;
    }  
}
