package Task2_OCP.Controller;

import java.util.List;
import java.util.Scanner;

import Task2_OCP.Model.Vehicle;
import Task2_OCP.Viev.PrintInfoVehicle;

/** 
 * Класс - Контроль транспортных средств(сбор данных и вывод на печать)
 * @author --
 * @version 1.0
*/
public class VehicleControl {
    /** поле - список транспортных средств*/
    List<Vehicle> vehicleList;
    /** поле - Класс - Печать информации по транспортным средствам */
    PrintInfoVehicle printIV = new PrintInfoVehicle();

    /**
     * Конструктор - создание нового объекта (Контроль транспортных средств)
     * @param vehicleList - список транспортных средств
     * @param 
     */
    public VehicleControl(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    /**
     * Метод - запускает цикл ввода команд для изучения списка транспортных средств
     */
    public void runVehicle()
    {
        boolean go = true;
        while(go)
        {
            System.out.print("Введите команду...\n   0) Выход\n   1) Список транспортных средств\n...");
            Scanner input = new Scanner(System.in);
            int numCommand = input.nextInt();
            switch(numCommand)
            {
                case 0:
                    go=false;
                    System.out.println("Выход из программы \"Контроль транспортных средств!\"");
                    break;
                case 1:
                    printIV.printAllVehicle(vehicleList);
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }
        }
    }  
}
