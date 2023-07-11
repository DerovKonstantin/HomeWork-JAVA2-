package Domen;

import java.util.Iterator;
import java.util.List;

/** 
 * Класс поток, использует интерфейс перечесления
 * @author --
 * @version 1.0
*/
public class StudentSteam implements Iterable<StudentGroup>{
    /** поле список групп в потоке */
    private List<StudentGroup> stSteam;
    /** поле идентификатор группы */
    private Integer idSteam;

    /**
     * Конструктор - создание нового объекта (поток)
     * @param stSteam - поток (список групп)
     * @param idSteam - идентификатор потока
     */
    public StudentSteam(List<StudentGroup> stSteam, Integer idSteam) {
        this.stSteam = stSteam;
        this.idSteam = idSteam;
    }

    /**
     * Получения значения поля поток (список групп)
     */
    public List<StudentGroup> getStSteam() {
        return stSteam;
    }

    /**
     * Определение значения поля поток (список групп)
     * @param stSteam - поле идентификатор потока
     */
    public void setStSteam(List<StudentGroup> stSteam) {
        this.stSteam = stSteam;
    }

    /**
     * Получения значения поля идентификатор потока
     */
    public Integer getIdSteam() {
        return idSteam;
    }

    /**
     * Определение значения поля идентификатор потока
     * @param idSteam - поле идентификатор потока
     */
    public void setIdSteam(Integer idSteam) {
        this.idSteam = idSteam;
    }

    @Override
    public String toString() {
        StringBuilder string_builder = new StringBuilder();
        for(StudentGroup group : stSteam)
        {
            string_builder.append("idGroup - ");
            string_builder.append(group.getIdGroup());
            string_builder.append("\n");
            for(Student std : group.getGroup()){
                string_builder.append("\t");
                string_builder.append(std);
                string_builder.append("\n");
            }
        }
        return string_builder.toString();
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new PersonIterator(stSteam);
        // return new Iterator<StudentGroup>() {

        //     private int counter;

        //     @Override
        //     public boolean hasNext() {

        //         if(counter<stSteam.size())
        //         {
        //             return true;
        //         }
        //         else
        //         {
        //             return false;
        //         }            
        //     }

        //     @Override
        //     public StudentGroup next() {            
        //         return stSteam.get(counter++);
        //     }
        // };
    }
    
}
