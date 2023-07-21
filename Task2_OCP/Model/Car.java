package Task2_OCP.Model;

/** 
 * Класс - Автомобиль, наследник класса Транспортное средство
 * @author --
 * @version 1.0
*/
public class Car extends Vehicle {

    /**
     * Конструктор - создание нового объекта (Автомобиль)
     * @param maxSpeed - максимальная скорость
     * @param type - тип автомобиля
     */
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    public int getMaxSpeed() {
        return super.maxSpeed;
    }

    public String getType() {
        return super.type;
    }

    public double calculateAllowedSpeed() {
        return super.maxSpeed * 0.8;
    }   
}
