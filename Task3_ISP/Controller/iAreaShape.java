package Task3_ISP.Controller;

/** 
 * Интерфейс - Площадь фигуры(метод для расчета площади заданной фигуры), наследник iShape
 * @author --
 * @version 1.0
*/
public interface iAreaShape extends iShape {

    public String getType();

    /**
     * Метод - вычисляет площадь заданной фигуры
     */
    public double area();
}
