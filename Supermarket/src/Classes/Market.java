package Classes;

import java.util.List;
import java.util.ArrayList;
import Interfaces.iActorBehaviuor;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

/** 
 * Класс магазин реализующий интерфейсы поведение в магазине, поведение очереди, возврат заказа
 * @author --
 * @version 1.0
*/
public class Market implements iMarketBehaviour,iQueueBehaviour,iReturnOrder {
    
    /** поле список клиентов пришедших в магазин (очередь) */
    private List<iActorBehaviuor> queue;

    /**
     * Конструктор - создание нового объекта (очередь)
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviuor>();
    }

    @Override
    public void acceptToMarket(iActorBehaviuor actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviuor actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
       takeOrder();
       giveOrder();
       returnOrder();
       releaseFromQueue();

    }

    @Override
    public void giveOrder() {
        for(iActorBehaviuor actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviuor actor:queue)
       {
        if(actor.isTakeOrder())
        {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
        }

        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for(iActorBehaviuor actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");
            }
        }
    }

    @Override
    public void returnOrder() {
        for(iActorBehaviuor actor: queue)
        {
            if(actor.isMakeOrder() & actor.isTakeOrder())
            {
                actor.setMakeOrder(false);
                System.out.println(actor.getActor().getName()+" клиент вернул свой заказ ");
            }
        }
    } 
}
