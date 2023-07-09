package Domen;

/** 
 * Класс студент, наследник класса человек, использует интерфейс сравнения
 * @author --
 * @version 1.0
*/
public class Student extends Person implements Comparable<Student> {
    /** поле идентификатор */
    private int id;

    /**
     * Конструктор - создание нового объекта (человек)
     * @param name - имя студента
     * @param age - возраст студента
     * @param id - идентификатор
     */
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }
/* 
    // private int age;
    // private String name;

    // public int getAge() {
    //     return age;
    // }

    // public String getName() {
    //     return name;
    // }
*/
    /**
     * Получения значения поля идентификатор
     */
    public int getId() {
        return id;
    }
/*
    // public void setAge(int age) {
    //     this.age = age;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }
*/
    /**
     * Определение значения поля идентификатор
     * @param id - поле идентификатор
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
    
}


