import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Controllers.StudentController;
import Controllers.TeacherController;
import Domen.AverageAge;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;
import Domen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        
        //первая группа
        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь",  23, 444);
        Student s5 = new Student("Даша",  23, 171);
        Student s6 = new Student("Лена",  23, 104);
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);
        StudentGroup group4580 = new StudentGroup(listStud1, 4580);
/*
        // System.out.println(group4580);

        // for(Student std : group4580)
        // {
        //     System.out.println(std);
        // }

        // System.out.println("=========================================================");

        // Collections.sort(group4580.getGroup());

        // for(Student std: group4580.getGroup())
        // {
        //     System.out.println(std);
        // }
*/
        
/* 
        //втора гуппа
        Student h1 = new Student("Migel", 35, 451);
        Student h2 = new Student("Hoan", 33, 191);
        Student h3 = new Student("Gonsalo", 32, 145);
        Student h4 = new Student("Rekardo",  33, 412);
        Student h5 = new Student("Lupo",  33, 146);
        Student h6 = new Student("Ololosha",  33, 124);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(h1);
        listStud2.add(h2);
        listStud2.add(h3);
        listStud2.add(h4);
        listStud2.add(h5);
        listStud2.add(h6);
        StudentGroup group4581 = new StudentGroup(listStud2, 4583);
        
        //третья группа
        Student x1 = new Student("Buratino", 1, 341);
        Student x2 = new Student("Alisa", 40, 157);
        Student x3 = new Student("Bazilio", 45, 420);
        Student x4 = new Student("Barabas",  60, 452);
        Student x5 = new Student("Durimar",  55, 171);
        Student x6 = new Student("Giuseppe",  50, 134);
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(x1);
        listStud3.add(x2);
        listStud3.add(x3);
        listStud3.add(x4);
        listStud3.add(x5);
        listStud3.add(x6);
        StudentGroup group4582 = new StudentGroup(listStud3, 4582);

        //поток
        List<StudentGroup> listStudentSteam = new ArrayList<StudentGroup>();
        listStudentSteam.add(group4580);
        listStudentSteam.add(group4581);
        listStudentSteam.add(group4582);
        StudentSteam steam1 = new StudentSteam(listStudentSteam, 1);
        
        //сравнение групп
        System.out.println("=========================================================");
        System.out.println(steam1);
        System.out.println("=========================================================");
        Collections.sort(steam1.getStSteam());
        System.out.println(steam1);
*/

/* 
        // Student s1 = new Student("Иван", 25, 121);
        // Student s2 = new Student("Игорь", 23, 301);

        // PersonComparator<Student> comS = new PersonComparator<Student>();
        // comS.compare(s1, s2);

        // Teacher t1 = new Teacher("Иван", 25, "Docent");
        // Teacher t2 = new Teacher("Игорь", 23, "Professor");

        // PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        // comT.compare(t1, t2);

        //comS.compare(s1, t2);
        ////PersonComparator<Person> comP = new PersonComparator<Person>();
        ////comP.compare(s1, t2);

        ////Emploee e1 = new Emploee("Федорович", 60, "разнорабочим");
        //EmploeeController empControll = new EmploeeController();
        ////EmploeeController.paySalary(e1);
       // EmploeeController.paySalary(s1);
        //empControll.paySalary(e1);
        //empControll.paySalary(s1);
*/

        //третья группа
        Teacher x1 = new Teacher("Buratino", 1, "Docent");
        Teacher x2 = new Teacher("Alisa", 40, "Professor");
        Teacher x3 = new Teacher("Bazilio", 45, "Professor");
        Teacher x4 = new Teacher("Barabas",  60, "Professor");
        Teacher x5 = new Teacher("Durimar",  55, "Professor");
        Teacher x6 = new Teacher("Giuseppe",  50, "Professor");
        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(x1);
        teachers.add(x2);
        teachers.add(x3);
        teachers.add(x4);
        teachers.add(x5);
        teachers.add(x6);
        
        TeacherController teCo = new TeacherController();
        for( Teacher teacher : teachers){
                teCo.create(teacher.getName(), teacher.getAge()); ;
            }
            System.out.println(teCo.toString());

        AverageAge avAg = new AverageAge(group4580.getGroup());
        System.out.println(avAg);

    }
}
