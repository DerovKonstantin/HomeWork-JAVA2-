package Controller;

import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

//import Model.ModelList;
import Model.Student;
//import View.View;

/** 
 * Класс - контроллер(сбор данных и вывод на печать, через интерфейсы iGetModel и iGetModel)
 * @author --
 * @version 1.0
*/
public class Controller {
    /** поле - интерфейс - получить модель*/
    private iGetModel model;
    /** поле - интерфейс - получить вид*/
    private iGetView view;
    /** поле - список студентов(используется внутри класса контролер для осуществления проверок)*/
    private List<Student> students = new ArrayList<>();

    /**
     * Конструктор - создание нового объекта (контроллер)
     * @param model - интерфейс - получить модель
     * @param view - интерфейс - получить вид
     */
    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Метод - осуществляет проверку наличия элементов в списке
     * @param students - список студентов
     */
    private boolean testData(List<Student> students) {
        if(students.size()>0) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Метод - выводит на печать список студентов(при наличии элементов списка) 
     */
    public void update() {
        //Реализация архитектуры MVP
        students = model.getAllStudents();
        if(testData(students)) {
           view.printAllStudents(students);
        }
        else {
            System.out.println("Список студентов пуст!");
        }

        //Реализауия архитектуры MVC
        //view.printAllStudents(model.getAllStudents());
    }

    /**
     * Метод - запускает цикл ввода команд 
     */
    public void run()
    {
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду...\n   E) EXIT\n   L) LIST\n   D) DELETE\n...");
            switch(command.toUpperCase())
            {
                case "E":
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case "L":
                    view.printAllStudents(model.getAllStudents());
                    break;
                case "D":
                    model.delStudents();
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }

        }
    // public void run()
    // {
    //     Command com = Command.NONE;
    //     boolean getNewIteration = true;
    //     while(getNewIteration)
    //     {
    //         String command = view.prompt("Введите команду:");
    //         com = Command.valueOf(command.toUpperCase());
    //         switch(com)
    //         {
    //             case EXIT:
    //                 getNewIteration=false;
    //                 System.out.println("Выход из программы!");
    //                 break;
    //             case LIST:
    //                 view.printAllStudents(model.getAllStudents());
    //                 break;
    //             default:
    //                 System.out.println("Операция не распознана. Повторите ввод.");
    //         }

    //     }
    }

    
}
