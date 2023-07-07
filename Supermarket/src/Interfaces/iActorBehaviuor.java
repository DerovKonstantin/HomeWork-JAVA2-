package Interfaces;

import Classes.Actor;

/** 
 * интерфейс поведения покупателя
 * @author --
 * @version 1.0
*/
public interface iActorBehaviuor {

    /**
     * Функция получения значения поля - принять заказ (да/нет)
     */
    public boolean isTakeOrder() ;
    /**
     * Функция получения значения поля  - сделать заказ (да/нет)
     */
    public boolean isMakeOrder() ;
    /**
     * Процедура определения значение поля - принять заказ (true/false)
     * @param takeOrder - поле принять заказ
     */
    public void setTakeOrder(boolean takeOrder) ;
    /**
     * Процедура определения значение поля - сделать заказ (true/false)
     * @param makeOrder - поле сделать заказ
     */
    public void setMakeOrder(boolean makeOrder) ;
    /**
     * Функция получения ссылки на текущий класс
     */
    Actor getActor();
    
}
