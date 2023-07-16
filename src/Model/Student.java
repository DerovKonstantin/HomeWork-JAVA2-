package Model;

/** 
 * Класс - студент, наследник класса Person, использует интерфейс Comparable<Student>
 * @author --
 * @version 1.0
*/
public class Student extends Person implements Comparable<Student> {
    /** поле - идентификатор студента*/
    private int id;

    /**
     * Конструктор - создание нового объекта (студент)
     * @param name - имя студента
     * @param age - возраст студента
     * @param id - идентификатор студента
     */
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    /**
     * Получение значения поля - идентификатор студента
     */
    public int getId() {
        return id;
    }

    /**
     * Определения значения поля - идентификатор студента
     * @param id - идентификатор студента
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }

    @Override
    public int compareTo(Student o) {

        System.out.println(super.getName()+" - "+o.getName());
        if(super.getAge()==o.getAge())
        {
            if(id==o.id)return 0 ;
            if(id>o.id)return 1;
            else return -1;
            //return 0;
        }

        if(super.getAge()>o.getAge())
        return 1;
        else
        return -1;        
    }

    // public Student replaceAll(String string, String string2) {
    //     return null;
    // }  
    
}


