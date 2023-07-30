package Control;
import Model.ComplexNumCalculator.ComplexNum;
import Model.ComplexNumCalculator.ComplexNumCalculator;

/** 
 * Класс - Калькулятор адаптер комплексных чисел
 * @author --
 * @version 1.0
*/
public class CalculatorAdapterCNum implements iCalculableAdapterCNum {
    /** Поле - Класс - Комплексные числа(значения первичного аргумента) */
    private ComplexNum frtArg;
    /** Поле - Класс - Комплексные числа(значения нового аргумента) */
    private ComplexNum newArg;
    /** Поле - Класс - Калькулятор комплексных чисел */
    private ComplexNumCalculator сpxNumClc;

    /**
     * Конструктор - создание нового объекта (Вид калькулятора)
     * @param frtArg - значения первичного аргумента(класс - комплексные числа)
     * @param newArg - значения нового аргумента(класс - комплексные числа)
     * @param сpxNumClc - Класс - Калькулятор комплексных чисел
     */
    public CalculatorAdapterCNum(ComplexNum frtArg, ComplexNum newArg, ComplexNumCalculator сpxNumClc) {
        this.frtArg = frtArg;
        this.newArg = newArg;
        this.сpxNumClc = сpxNumClc;
    }


    @Override
    public iCalculableAdapterCNum sum(int realNewArg) {
        newArg.setRealNum(realNewArg);
        newArg.inputImaginNum();
        сpxNumClc.sum(newArg);
        return this;
    }

    @Override
    public iCalculableAdapterCNum diff(int realNewArg) {
        newArg.setRealNum(realNewArg);
        newArg.inputImaginNum();
        сpxNumClc.diff(newArg);
        return this;
    }

    @Override
    public iCalculableAdapterCNum multi(int realNewArg) {
        newArg.setRealNum(realNewArg);
        newArg.inputImaginNum();
        сpxNumClc.multi(newArg);
        return this;
    }

    @Override
    public iCalculableAdapterCNum divis(int realNewArg) {
        newArg.setRealNum(realNewArg);
        newArg.inputImaginNum();
        сpxNumClc.divis(newArg);
        return this;
    }

    @Override
    public ComplexNum getResult() {
        return frtArg;
    }

    @Override
    public ComplexNum getNewArgument() {
        return newArg;
    }

}
