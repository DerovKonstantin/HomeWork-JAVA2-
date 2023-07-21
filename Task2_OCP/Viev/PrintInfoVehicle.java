package Task2_OCP.Viev;

import java.util.List;

import Task2_OCP.Model.Vehicle;

/** 
 * Класс - Печать информации по транспортным средствам(отображает список транспортных средств, максимальную и допустимую скорость)
 * @author --
 * @version 1.0
*/
public class PrintInfoVehicle {

    /**
     * Метод - выводит на печать список всех транспортных средств
     * @param vehicleList - список транспортных средств
     */
    public void printAllVehicle(List<Vehicle> vehicleList)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("////////////////////////////////////////////////////////////////\n");
        stringBuilder.append("Данные по транспортным средствам...\n");
        for(Vehicle veh: vehicleList){
            stringBuilder.append("\t");
            stringBuilder.append(veh.getType());
            stringBuilder.append(" , максимальная скорость...");
            stringBuilder.append(veh.getMaxSpeed());
            stringBuilder.append(" , допустимая скорость...");
            stringBuilder.append(veh.calculateAllowedSpeed());
            stringBuilder.append(" .\n"); 
        }
        stringBuilder.append("////////////////////////////////////////////////////////////////\n");
        System.out.print(stringBuilder.toString());
    }
    
}
