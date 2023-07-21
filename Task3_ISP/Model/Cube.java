package Task3_ISP.Model;

import Task3_ISP.Controller.iShape;
import Task3_ISP.Controller.iAreaShape;
import Task3_ISP.Controller.iVolumeShape;

/** 
 * Класс - Куб, использует интерфейс iAreaShape(Площадь фигуры) и iVolumeShape(Объем фигуры)
 * @author --
 * @version 1.0
*/
public class Cube implements iAreaShape, iVolumeShape {
    /** поле - грань */
    private int edge;

     /**
     * Конструктор - создание нового объекта (Куб)
     * @param edge - грань
     */
    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public String getType() {
        return "Куб";
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
