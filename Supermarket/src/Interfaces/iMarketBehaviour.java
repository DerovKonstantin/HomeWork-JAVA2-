package Interfaces;
import java.util.List;
import Classes.Actor;

/** 
 * интерфейс поведения магазина
 * @author --
 * @version 1.0
*/
public interface iMarketBehaviour {
    /**
     * Функция получения значения поля имя клиента и добавление его в очередь
     */
    void acceptToMarket(iActorBehaviuor actor);
    /**
     * Функция получения значения поля имя клиента и удаление его из очереди
     */
    void releaseFromMarket(List<Actor> actor);
    /**
     * Какая то логика работы магазина
     */
    void update();
}
