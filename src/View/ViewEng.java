package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/** 
 * Класс - вид на английском(отображает список студентов и харрактеристики на английском языке), использует интерфейс iGetView
 * @author 
 * Дёров Константин
 * @version 1.0
*/
public class ViewEng implements iGetView {

    @Override
    public void printAllStudents(List<Student> students) {
        System.out.println("------students list--------");
        String[] english = {"A","B","C","D","E","F","G","H","I","J","X","L","M","N","O","P","Q","R","S","T","U","V","W","K","Y","Z",
                            "a","b","c","d","e","f","g","h","i","j","x","l","m","n","o","p","q","r","s","t","u","v","w","k","y","z",""};
        String [] russian = {"А","Б","К","Д","Э","Ф","Г","Х","И","Ж","КС","Л","М","Н","О","П","К","Р","С","Т","У","В","В","К","Й","З",
                            "а","б","к","д","э","ф","г","х","и","ж","кс","л","м","н","о","п","к","р","с","т","у","в","в","к","й","з","ь"};
        StringBuilder stringBuilder = new StringBuilder();
        for(Student stud: students)
        {
            String nameCopy = stud.getName();
            for(int i=0; i < russian.length; i++){
                nameCopy = nameCopy.replaceAll(russian[i], english[i]);
            }
            //"Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
            stringBuilder.append("Students [age=");
            stringBuilder.append(stud.getAge());
            stringBuilder.append(", name=");
            stringBuilder.append(nameCopy);
            stringBuilder.append(", id=");
            stringBuilder.append(stud.getId());
            stringBuilder.append("]\n");
        }
        System.out.println(stringBuilder.toString());
        System.out.println("===============================");
    }

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        if (msg.equals("Введите команду...\n   E) EXIT\n   L) LIST\n   D) DELETE\n...")){
            msg = "Enter the command...\n   E) EXIT\n   L) LIST\n   D) DELETE\n...";
        }
        System.out.print(msg);
        return in.nextLine();
    }
//--------------------------------------------------------------------
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public void displayStudents(List<Student> students) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Long getStudentIdToDelete() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Long getStudentIdToUpdate() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void printAllStudent(List<Student> students) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Student readStudent() {
        // TODO Auto-generated method stub
        return null;
    }

    

    
    
}
