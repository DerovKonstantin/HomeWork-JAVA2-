package Task3_ISP.Model;

import Task3_ISP.Controller.iShape;
import Task3_ISP.Controller.iAreaShape;

/** 
 * Класс - Круг, использует интерфейс iAreaShape(Площадь фигуры)
 * @author --
 * @version 1.0
*/
public class Circle implements iAreaShape {
    /** поле - радиус */
    private double radius;

    /**
     * Конструктор - создание нового объекта (Круг)
     * @param radius - радиус
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Круг";
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
    

