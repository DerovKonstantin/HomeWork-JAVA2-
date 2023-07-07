package Classes;

/** 
 * Класс клиент по акции наследник класса клиент
 * @author Дёорк Константин
 * @version 1.0
*/
public class PromotionClient extends Actor {
    
    /** поле идентификационный номер клиента по акции */
    private int promoID;
    /** поле название акции */
    private String promoName;
    /** поле максимально колличество участников акции */
    static int promoTotalNum;
    /** поле номер участника акции */
    private int numInPromo;
    /** поле счетчик */
    static int num;

    {
        this.promoName = "Price deflection";
        this.promoTotalNum = 1;
    }
    /**
     * Конструктор - создание нового объекта (обычный клиент)
     * @param name - имя клиента
     * @param pensID - идентификационный номер клиента по акции
     */
    public PromotionClient(String name, int PpromotionID) {
        super(name + " - по акции");
        this.promoID = promoID;
        this.numInPromo = num++;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
      if (numInPromo > promoTotalNum & super.isMakeOrder == false & super.isTakeOrder == false){
        System.out.println(super.name + " обслуживание закончено!");
        super.isMakeOrder = true;
      }
      else if (numInPromo > promoTotalNum & super.isMakeOrder == true & super.isTakeOrder == false){
        super.isMakeOrder = false;
        super.isTakeOrder = true;
      }
      return super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean makeOder) {
      super.isTakeOrder = makeOder;
    }
    
    @Override
    public void setMakeOrder(boolean pikUpOrder) {
      super.isMakeOrder = pikUpOrder;
    }

    @Override
    public Actor getActor() {
      return this;
    }

}
