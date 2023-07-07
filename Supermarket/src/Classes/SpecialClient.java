package Classes;

/** 
 * Класс спец клиент наследник класса клиент
 * @author --
 * @version 1.0
*/
public class SpecialClient extends Actor{

    /** поле идентификационный номер спец клиента */
    private int idVip;

    /**
     * Конструктор - создание нового объекта (обычный клиент)
     * @param name - имя клиента
     * @param pensID - идентификационный номер спец клиента
     */
    public SpecialClient(String name, Integer id) {
        super(name);
        idVip = id;
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

    // @Override
    // public String getName() {
    //     return name;
    // }

    // public int getIdVip() {
    //     return idVip;
    // }
}
