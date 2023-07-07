package Interfaces;
import Classes.Actor;

/** 
 * интерфейс поведения очереди
 * @author --
 * @version 1.0
*/
public interface iQueueBehaviour {
    /**
     * Процедура добавления имени клиента в очередь
     * @param actor - поле имя клиента
     */
    void takeInQueue(iActorBehaviuor actor);
    /**
     * Процедура даления имен клиентов из очереди
     */
    void releaseFromQueue();
    /**
     * Процедура составления заказов на основе имеющийся очереди
     */
    void takeOrder();
    /**
     * Процедура выдачи заказов н основе очереди сделанных заказов
     */
    void giveOrder();
}
