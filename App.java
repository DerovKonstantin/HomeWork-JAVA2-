
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import Task1_SRP.Controller.EmployeeControl;
import Task1_SRP.Model.Employee;
import Task1_SRP.Model.Salary;
import Task2_OCP.Controller.VehicleControl;
import Task2_OCP.Model.Bus;
import Task2_OCP.Model.Car;
import Task2_OCP.Model.Vehicle;
import Task3_ISP.Controller.ShapeControl;
import Task3_ISP.Controller.iShape;
import Task3_ISP.Model.Circle;
import Task3_ISP.Model.Cube;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Задача 1. Создаем сотрудников
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Employee e1 = new Employee("Сергей", simpleDateFormat.parse("1973/03/18"));
        Employee e2 = new Employee("Андрей",  simpleDateFormat.parse("1982/07/22"));
        Employee e3 = new Employee("Иван", simpleDateFormat.parse("1998/11/28"));
        
        //Заполняем списовк сотрудников
        List<Employee> employee = new ArrayList<Employee>();
        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        
        //Запускаем логику первой задачи
        Salary salary = new Salary(40000);
        EmployeeControl employeeControl = new EmployeeControl(employee, salary);
        employeeControl.runEmployee();
        System.out.println("//////////////////////////////////////////");
        
        //////////////////////////////////////////////////////////////////////////////////////////
        
        //Задача 2. Создаем транспортное средство
        Vehicle v1 = new Bus(180, "Автобус M1");
        Vehicle v2 = new Bus(120, "Автобус M3");
        Vehicle v3 = new Car(220, "Седан");
        Vehicle v4 = new Car(250, "Кабриолет");
        
        //Заполняем список транспортных средств
        List<Vehicle> vehicle = new ArrayList<Vehicle>();
        vehicle.add(v1);
        vehicle.add(v2);
        vehicle.add(v3);
        vehicle.add(v4);
        
        //Запускаем логику втрой задачи
        VehicleControl vehicleControl = new VehicleControl(vehicle);
        vehicleControl.runVehicle();
        System.out.println("//////////////////////////////////////////");
        
        //////////////////////////////////////////////////////////////////////////////////////////

        //Задача 3. Создаем фигуры средство
        iShape s1 = new Circle(2);
        iShape s2 = new Circle(4);
        iShape s3 = new Cube(3);
        iShape s4 = new Cube(5);
        
        //Заполняем список фигурами
        List<iShape> shapeList = new ArrayList<iShape>();
        shapeList.add(s1);
        shapeList.add(s2);
        shapeList.add(s3);
        shapeList.add(s4);
        
        //Запускаем логику втрой задачи
        ShapeControl shapeControl = new ShapeControl(shapeList);
        shapeControl.runShape();
        System.out.println("//////////////////////////////////////////");

        //////////////////////////////////////////////////////////////////////////////////////////

        //Задача 4. Создаем фигуры средство
        System.out.println("Задача 4 выполнена, логика отображения ненаписана.");
        System.out.println("//////////////////////////////////////////");
        
        //Задача 5. Создаем фигуры средство
        System.out.println("Задача 5 выполнена, логика отображения ненаписана");
        System.out.println("//////////////////////////////////////////");
    }

}
