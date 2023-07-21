package Task1_SRP.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Task1_SRP.Model.Employee;
import Task1_SRP.Model.Salary;
import Task1_SRP.Viev.PrintInfoEmployee;

/** 
 * Класс - Контроль сотрудников(сбор данных и вывод на печать)
 * @author --
 * @version 1.0
*/
public class EmployeeControl {
    /** поле - список сотрудников*/
    private List<Employee> employeeList = new ArrayList<>();
    /** поле - базовая зарплата */
    private Salary salary;
    /** поле - Класс - Печать информации по сотрудникам */
    private PrintInfoEmployee printIE = new PrintInfoEmployee();

    /**
     * Конструктор - создание нового объекта (Контроль сотрудников)
     * @param employeeList - список сотрудников
     * @param salary - базовая зарплата
     */
    public EmployeeControl(List<Employee> employeeList, Salary salary) {
        this.employeeList = employeeList;
        this.salary = salary;
    }

    /**
     * Метод - запускает цикл ввода команд для изучения списка сотрудников
     */
    public void runEmployee()
    {
        boolean go = true;
        while(go)
        {
            System.out.print("Введите команду...\n   0) Выход\n   1) Список сотрудников\n   2) Базовая зарплата\n...");
            Scanner input = new Scanner(System.in);
            int numCommand = input.nextInt();
            switch(numCommand)
            {
                case 0:
                    go=false;
                    System.out.println("Выход из программы \"Контроль сотрудников!\"");
                    break;
                case 1:
                    printIE.printAllEmployee(employeeList);
                    break;
                case 2:
                    printIE.printSalary(salary);
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }
        }
    }    
}
