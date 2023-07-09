package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Emploee;
import Domen.Student;

/** 
 * Класс табель учета сотрудников, использует интерфейс табель учета людей
 * @author --
 * @version 1.0
*/
public class EmploeeService implements iPersonService<Emploee> {
    /** поле счетчик */
    private int count;
    /** поле список сотрудников */
    private List<Emploee> emploees;
    
    /**
     * Конструктор - создание нового объекта (список сотрудников)
     */
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }
    @Override
    public List<Emploee> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    @Override
    public void create(String firstName, int age) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }    
}
