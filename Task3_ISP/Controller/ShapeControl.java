package Task3_ISP.Controller;

import java.util.List;
import java.util.Scanner;

import Task3_ISP.Viev.PrintInfoShape;

/** 
 * Класс - Контроль фигур(сбор данных и вывод на печать)
 * @author --
 * @version 1.0
*/
public class ShapeControl {
    /** поле - список фигур*/
    List<iShape> shapeList;
    /** поле - Класс - Печать информации по транспортным средствам */
    PrintInfoShape printIS = new PrintInfoShape();


    /**
     * Конструктор - создание нового объекта (контроллер)
     * @param model - интерфейс - получить модель
     * @param view - интерфейс - получить вид
     */
    public ShapeControl(List<iShape> shapeList) {
        this.shapeList = shapeList;
    }

    /**
     * Метод - запускает цикл ввода команд для изучения списка всех имеющихся геометрических фигур
     */
    public void runShape()
    {
        boolean go = true;
        while(go)
        {
            System.out.print("Введите команду...\n   0) Выход\n   1) Список геометрических фигур\n...");
            Scanner input = new Scanner(System.in);
            int numCommand = input.nextInt();
            switch(numCommand)
            {
                case 0:
                    go=false;
                    System.out.println("Выход из программы \"Контроль геометрических фигур!\"");
                    break;
                case 1:
                    printIS.printAllVehicle(shapeList);
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }
        }
    }  

}