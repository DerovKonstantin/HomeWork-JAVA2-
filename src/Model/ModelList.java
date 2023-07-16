package Model;

import java.util.List;
import java.util.Scanner;

import java.util.Iterator;

import Controller.iGetModel;

/** 
 * Класс - список моделей(студентов и хоррактеристик), использует интерфейс iGetModel(возвращяет список)
 * @author --
 * @version 1.0
*/
public class ModelList implements iGetModel, Iterable<Student> {
    /** поле - список студентов*/
    private List<Student> students;

    /**
     * Конструктор - создание нового объекта (список студентов)
     * @param students - список студентов
     */
    public ModelList(List<Student> students) {
        this.students = students;
    }

    @Override
    public List<Student> getAllStudents()
    {
        return students;
    }

    @Override
    public void delStudents() {
        System.out.print("Введите id студента для удаления.\n...");
        Scanner input = new Scanner(System.in);
        String txtID = input.nextLine();
        while (!txtID.matches("\\d*")){
            System.out.print("Введены неверные данные, введите число.\n...");
            txtID = input.nextLine();
        }
        int id = Integer.parseInt (txtID);
        boolean deleted = false;
        ///////////////////////////////////////// пробую различные методы перебора списков
        Iterator<Student> stud = students.iterator();
        while(stud.hasNext()) {
            Student s = stud.next();
            if(s.getId() == id){
                System.out.printf("Стдент %s с номером id %d удален. \n", s.getName(), s.getId());
                stud.remove();
                deleted = true;
            }
        }
        /////////////////////////////////////////
        // for (int i = students.size()-1; i > 0; i--){ 
        //        if(students.get(i).getId() == id){
        //             System.out.printf("Стдент %s с номером id %d удален. \n", students.get(i).getName(), students.get(i).getId());
        //             students.remove(i);
        //             deleted = true;
        //        }
        //     }
        ///////////////////////////////////////// 
        // for(Student stud: students){
        //     if (stud.getId() == id){
        //         System.out.printf("Стдент %s с номером id %d удален. \n", stud.getName(), stud.getId());
        //         students.remove(stud);
        //         deleted = true;   
        //     }
        // }
        /////////////////////////////////////////
        if (!deleted){
            System.out.printf("Номером id %d не найден. \n", id);
        }
    }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int counter;

            @Override
            public boolean hasNext() {
                if(counter < students.size()){
                    return true;
                }
                else{
                    return false;
                }            
            }

            @Override
            public Student next() {            
                return students.get(counter++);
            }
        };
    }
}
