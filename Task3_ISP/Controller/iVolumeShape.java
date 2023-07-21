package Task3_ISP.Controller;

/** 
 * Интерфейс - Объем фигуры(метод для расчета объема заданной фигуры), наследник iShape
 * @author --
 * @version 1.0
*/
public interface iVolumeShape extends iShape {

    public String getType();

    /**
     * Метод - вычисляет объем заданной фигуры
     */
    double volume();
}
