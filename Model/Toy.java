package Model;

import java.io.Serializable;

/** 
 * Класс игршка использует интерфейс Сериализация (Serialization)
 * @author --
 * @version 1.0
*/
public class Toy implements Serializable {

    /** поле - идентификатор игрушки */
    private int id;
    /** поле - текстовое название игрушки */
    private String name;
    /** поле - количество игрушек */
    private int quantity;
    /** поле - количество призовых игрушек */
    private int numberOfPrize;
    /** поле - частота выпадения игрушки (вес в % от 100) */
    private int dropChance;
    
    /**
     * Конструктор - создание нового объекта (игршка)
     * @param id - идентификатор игрушки
     * @param name - текстовое название игрушки 
     * @param quantity - количество игрушек
     * @param numberOfPrize - количество призовых игрушек
     * @param dropChance частота выпадения игрушки
     */
    public Toy(int id, String name, int quantity, int numberOfPrize, int dropChance) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.numberOfPrize = numberOfPrize;
        this.dropChance = dropChance;
    }

    /**
     * Функция получения значения поля - идентификатор игрушки
     */
    public long getId() {
        return id;
    }

    /**
     * Определение значения поля - идентификатор игрушки
     * @param id - поле - идентификатор игрушки
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Функция получения значения поля - текстовое название игрушки
     */
    public String getName() {
        return name;
    }

    /**
     * Определение значения поля - текстовое название игрушки
     * @param name - поле - текстовое название игрушки
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Функция получения значения поля - количество игрушек
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Определение значения поля - количество игрушек
     * @param quantity - поле - количество игрушек
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Функция получения значения поля - количество призовых игрушек
     */
    public int getNumberOfPrize() {
        return numberOfPrize;
    }

    /**
     * Определение значения поля - количество призовых игрушек
     * @param numberOfPrize - поле - количество призовых игрушек
     */
    public void setNumberOfPrize(int numberOfPrize) {
        this.numberOfPrize = numberOfPrize;
    }

    /**
     * Функция получения значения поля - частота выпадения игрушки (вес в % от 100)
     */
    public int getDropChance(){
        return dropChance;
    }

    /**
     * Определение значения поля - частота выпадения игрушки (вес в % от 100)
     * @param toyDropChance - поле - частота выпадения игрушки (вес в % от 100)
     */
    public void setDropChance(int dropChance) {
        this.dropChance = dropChance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("...");
        sb.append("\n   Идентификационный номер.......");
        sb.append(id);
        sb.append("\n   Название игрушки..............");
        sb.append(name);
        sb.append("\n   Количество игрушек............");
        sb.append(quantity);
        sb.append("\n   количество призовых игрушек...");
        sb.append(numberOfPrize);
        sb.append("\n   частота выпадения игрушки.....");
        sb.append(dropChance);
        sb.append("\n   ...");
        return sb.toString();
    }

}
