package Task1_SRP.Viev;

import java.util.List;

import Task1_SRP.Model.Employee;
import Task1_SRP.Model.Salary;

/** 
 * Класс - Печать информации по сотрудникам(отображает список сотрудников и зарплату)
 * @author --
 * @version 1.0
*/
public class PrintInfoEmployee {

    /**
     * Метод - выводит на печать список всех сотрудников
     * @param employeeList - список сотрудников
     */
    public void printAllEmployee(List<Employee> employeeList)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("////////////////////////////////////////////////////////////////\n");
        stringBuilder.append("Данные по сотрудникам...\n");
        for(Employee emp: employeeList){
            stringBuilder.append("\t");
            stringBuilder.append(emp.getEmpInfo());
            stringBuilder.append(" .\n"); 
        }
        stringBuilder.append("////////////////////////////////////////////////////////////////\n");
        System.out.print(stringBuilder.toString());
    }

    /**
     * Метод - выводит на печть размер зарплаты
     * @param salary - зарплата
     */
    public void printSalary(Salary salary){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("//////////////////////////////////////\n");
        stringBuilder.append("Размер зарплаты составляет...");
        stringBuilder.append(salary.calculateNetSalary());
        stringBuilder.append(" р.\n//////////////////////////////////////\n");
        System.out.print(stringBuilder.toString());
    }

}
