package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

import Controller.iGetModel;

/** 
 * Класс - хэш-таблица модели(идентификатор студента и хоррактеристики), использует интерфейс iGetModel(возвращяет список)
 * @author Дёров Константин
 * @version 1.0
*/
public class HachModel implements iGetModel {
    /** поле - хэш-таблица студентов*/
    private HashMap<Long,Student> studentsHashMap;

    /**
     * Конструктор - создание нового объекта (хэш-таблица студентов)
     * @param studentsHashMap - хэш-таблица студентов
     */
    public HachModel(HashMap<Long,Student> studentsHashMap) {
        this.studentsHashMap = studentsHashMap;
    }

    @Override
    public List<Student> getAllStudents(){
        List<Student> studentsList = new ArrayList<Student>();
        for (Entry<Long, Student> student: studentsHashMap.entrySet()){
            studentsList.add(student.getValue());
        }
        return studentsList;
    }

    @Override
    public void delStudents() {
        System.out.println("Введите id студента для удаления.");
        
        Scanner input = new Scanner(System.in);
        String txtID = input.nextLine();
        while (!txtID.matches("\\d*")){
            System.out.print("Введены неверные данные, введите число: - ");
            txtID = input.nextLine();
        }
        Long id = (long) Integer.parseInt (txtID);

        if (studentsHashMap.containsKey(id)){
            System.out.printf("Стдент %s с номером id %d удален. \n", studentsHashMap.get(id).getName(), id);
            studentsHashMap.remove(id);
        }
        else{
            System.out.printf("Номером id %d не найден. \n", id);
        }
    }

}