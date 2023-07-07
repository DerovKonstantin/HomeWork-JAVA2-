package Classes;

/** 
 * Класс обычьный клиент наследник класса клиент
 * @author --
 * @version 1.0
*/
public class OrdinaryClient extends Actor {
    // private boolean setTakeOrder;
    // private boolean setMakeOrder;

    /**
     * Конструктор - создание нового объекта (обычный клиент)
     * @param name - имя клиента
     * @param pensID - идентификационный номер клиента
     */
    public OrdinaryClient(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
       isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       isTakeOrder = pickUpOrder;   
    }

    public Actor getActor() {
      return this;
    }

    // public boolean isSetTakeOrder() {
    //     return setTakeOrder;
    // }

    // public void setSetTakeOrder(boolean setTakeOrder) {
    //     this.setTakeOrder = setTakeOrder;
    // }

    // public boolean isSetMakeOrder() {
    //     return setMakeOrder;
    // }

    // public void setSetMakeOrder(boolean setMakeOrder) {
    //     this.setMakeOrder = setMakeOrder;
    // }

    // @Override
    // public String getName() {
    //     return name;
    // }
}