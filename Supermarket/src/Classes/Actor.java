package Classes;

import Interfaces.iActorBehaviuor;

/** 
 * Класс покупатель реализующий интерфейс поведения покупателя
 * @author --
 * @version 1.0
*/
public abstract class Actor implements iActorBehaviuor {
    
    /** поле имя */
    protected String name;
    /** поле принять заказ (да/нет) */
    protected boolean isTakeOrder;
    /** поле сделать заказ (да/нет) */
    protected boolean isMakeOrder;

    /**
     * Конструктор - создание нового объекта (клиент)
     * @param name - имя клиента
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Функция получения значения поля имя клиента
     */
    abstract public String getName();

    // public boolean isTakeOrder() {
    //     return isTakeOrder;
    // }

    // public boolean isMakeOrder() {
    //     return isMakeOrder;
    // }

    // public void setTakeOrder(boolean takeOrder) {
    //     isTakeOrder = takeOrder;
    // }

    // public void setMakeOrder(boolean makeOrder) {
    //     isMakeOrder = makeOrder;
    // }
}
