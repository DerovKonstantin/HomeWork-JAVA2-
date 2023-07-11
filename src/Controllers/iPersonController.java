package Controllers;

import Domen.Person;

/** 
 * интерфейс контроля и регистрации людей в базе данных, наследник класса человек
 * @author --
 * @version 1.0
*/
public interface iPersonController<T extends Person> {
    void create(String firstName, int age);    
}
