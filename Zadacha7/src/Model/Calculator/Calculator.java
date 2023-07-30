
package Model.Calculator;

import Control.iCalculable;

/** 
 * Класс - Калькулятор, использует интерфейс iCalculable(Калькулятор)
 * @author --
 * @version 1.0
*/
public final class Calculator implements iCalculable {
    /** Поле — значения первичного аргумента */
    private int primaryArg;

    /**
     * Конструктор - создание нового объекта (Калькулятор)
     * @param primaryArg - значения первичного аргумента
     */
    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public iCalculable sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public iCalculable diff(int arg) {
        primaryArg -= arg;
        return this;
    }

    @Override
    public iCalculable multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public iCalculable divis(int arg) {
        primaryArg /= arg;
        return this;
    }

    @Override
    public Integer getResult() {
        return primaryArg;
    }
    
}
