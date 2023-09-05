package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/** 
 * Класс - хранение данных
 * @author --
 * @version 1.0
*/
public class DataStorage {

    /** поле - класс - список игушек */
    private Toys toys;
    /** поле - имя файла хранения данных */
    private String filename;

    /**
     * Конструктор - создание нового объекта (хранение данных)
     * @param filename - имя файла
     * @param toys - список игрушек
     */
    public DataStorage( String filename, Toys toys) {
        this.filename = filename;
        this.toys = toys;
    }

    /**
     * Метод - сохранение данных
     */
    public void saveToys() {
        //this.toys = toys;
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
            oos.writeObject(filename);
            System.out.println("Данные были сохранены!...");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }

    /**
     * Метод - загрузка данных
     */
    public Toys loadToys(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
            toys = (Toys)ois.readObject();
            System.out.println("Данные были загружены!...");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
        return toys;
    }
    
}
