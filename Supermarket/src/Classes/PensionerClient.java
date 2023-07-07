package Classes;

/** 
 * Класс пенсионер наследник класса клиент
 * @author --
 * @version 1.0
*/
public class PensionerClient extends Actor {
    /** поле идентификационный номер пенсионера */
    private int pensID;

    /**
     * Конструктор - создание нового объекта (пенсионер)
     * @param name - имя клиента
     * @param pensID - идентификационный номер пенсионера
     */
    public PensionerClient(String name, int pensID) {
        super(name+" - пенсионер");
        this.pensID = pensID;
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
}
