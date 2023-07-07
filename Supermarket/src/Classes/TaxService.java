package Classes;

import Interfaces.iActorBehaviuor;

/** 
 * Класс Налоговая служба реализующий интерфейс поведения покупателя
 * @author --
 * @version 1.0
*/
public class TaxService implements iActorBehaviuor {

    /** поле имя клиента */
    private String name;
    /** поле принять заказ (true/false) */
    private boolean isTakeOrder;
    /** поле сделать заказ (true/false) */
    private boolean isMakeOrder;

    /**
     * Конструктор - создание нового объекта (Налоговая служба)
     */
    public TaxService() {
        this.name = "Tax audit";
    }

    /**
     * Функция получения значения поля
     * @return возвращяет имя покупателя
     */
     public String getName() {        
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
       isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       isTakeOrder = pickUpOrder;   
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }
}
