package Domen;

public class HotDrink extends Product {
    // Поля
    private int temp;
    //конструкторы
    public  HotDrink(int price, int place, String name, long id){
        super(price,place,name,id);
        this.temp = 0;
    }
    public HotDrink (int price, int place, String name, long id, int temp){
        super(price,place,name,id);
        this.temp = temp;
    }
    // Методы
    public float getHotDrinkTemp() {
        return temp;
    }

    public void setHotDrinkTemp(int temp) {
        this.temp = temp;
    }
    @Override
    public String toString() {
        return super.toString() + "temperature = " + temp ;
    }
}
