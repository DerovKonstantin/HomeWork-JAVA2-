package Domen;

/** 
 * Абстрактный класс человек реализующий интерфейс поведения покупателя
 * @author --
 * @version 1.0
*/
public abstract class Person {
    /** поле имя */
    private String name;
    /** поле возраст */
    private int age;
    
    /**
     * Конструктор - создание нового объекта (человек)
     * @param name - имя человека
     * @param age - возраст человека
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Получение значения поля имя человека
     */
    public String getName() {
        return name;
    }

    /**
     * Определения значения поля имя человека
     * @param name - поле имя человека
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получение значения поля возраст
     */
    public int getAge() {
        return age;
    }

    /**
     * Определение значения поля возраст
     * @param age - поле возраст
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
}
