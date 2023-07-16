package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

/** 
 * Класс - файл модели(лог файл), использует интерфейс iGetModel(возвращяет список)
 * @author --
 * @version 1.0
*/
public class ModelFile  implements iGetModel {
    /** поле - имя файла*/
    private String fileName;

    /**
     * Конструктор - создание нового объекта (лог файл)
     * @param fileName - имя файла
     */
    public ModelFile(String fileName) {
        this.fileName = fileName;
        // проверяем существует ли наш файл
        try(FileWriter fw = new FileWriter(fileName, false))
        {
            fw.flush();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students  = new ArrayList<Student>();
        try
        {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null)
            {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], Integer.parseInt(param[1]), Integer.parseInt(param[2]));
                students.add(pers);
                line = reader.readLine();
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        return students;
    }

    /**
     * Запись данных(студентов и хоррактеристик) в лог файл
     * @param students - список студентов
     */
    public void saveAllStudentToFile(List<Student> students)
    {
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            for(Student pers : students)
            {
                fw.write(pers.getName()+" "+pers.getAge()+" "+pers.getId());
                fw.append('\n');
            }
            fw.flush();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delStudents'");
    }
    
}
