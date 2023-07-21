package Task3_ISP.Viev;

import java.util.List;

import Task3_ISP.Controller.iAreaShape;
import Task3_ISP.Controller.iShape;
import Task3_ISP.Controller.iVolumeShape;

/** 
 * Класс - Печать информации по фигурам(отображает список фигур и их параметры)
 * @author --
 * @version 1.0
*/
public class PrintInfoShape {
    
    /**
     * Метод - выводит на печать список всех геометрических фигур
     * @param shapeList - список фигур
     */
    public void printAllVehicle(List<iShape> shapeList)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("////////////////////////////////////////////////////////////////\n");
        stringBuilder.append("Данные по имеющимся геометрическим фигурам...\n");
        for(iShape shap: shapeList){
            stringBuilder.append("\t");
            stringBuilder.append("Тип фигуры...");
            stringBuilder.append(shap.getType());
            stringBuilder.append(" , площадь фигуры...");
            stringBuilder.append(((iAreaShape) shap).area());
            if (shap instanceof iVolumeShape){
                stringBuilder.append(" , объем фигуры...");
                stringBuilder.append(((iVolumeShape) shap).volume());
            }
            stringBuilder.append(" .\n"); 
        }
        stringBuilder.append("////////////////////////////////////////////////////////////////\n");
        System.out.print(stringBuilder.toString());
    }
}
