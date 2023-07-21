package Task2_OCP.Model;

/** 
 * Класс - Автобус, наследник класса Транспортное средство
 * @author --
 * @version 1.0
*/
public class Bus extends Vehicle {

    /**
     * Конструктор - создание нового объекта (Автобус)
     * @param maxSpeed - максимальная скорость
     * @param type - тип 
     */
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }


    public int getMaxSpeed() {
        return super.maxSpeed;
    }

    public String getType() {
        return super.type;
    }

    public double calculateAllowedSpeed() {
        return super.maxSpeed * 0.6;
    }
    
}
