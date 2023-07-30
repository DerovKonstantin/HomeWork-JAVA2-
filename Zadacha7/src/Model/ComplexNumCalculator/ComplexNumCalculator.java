package Model.ComplexNumCalculator;
/** 
 * Класс - Калькулятор комплексных чисел
 * @author --
 * @version 1.0
*/
public class ComplexNumCalculator {
    /** Поле - значения первичного аргумента(класс - комплексные числа) */
    private ComplexNum frtArg;

     /**
     * Конструктор - создание нового объекта (Калькулятор комплексных чисел)
     * @param frtArg - значения первичного аргумента(класс - комплексные числа)
     */
    public ComplexNumCalculator(ComplexNum frtArg) {
        this.frtArg = frtArg;
    }

    /**
     * Метод - сложение
     * @param newArg - значения нового аргумента
     */
    public ComplexNum sum(ComplexNum newArg) {
        frtArg.setRealNum(frtArg.getRealNum() + newArg.getRealNum());
        frtArg.setImaginNum(frtArg.getImaginNum() + newArg.getImaginNum());
        return frtArg;
    }

    /**
     * Метод - вычетание
     * @param newArg - значения нового аргумента
     */
    public ComplexNum diff(ComplexNum newArg) {
        frtArg.setRealNum(frtArg.getRealNum() - newArg.getRealNum());
        frtArg.setImaginNum(frtArg.getImaginNum() - newArg.getImaginNum());
        return frtArg;
    }

    /**
     * Метод - умножение
     * @param newArg - значения нового аргумента
     */
    public ComplexNum multi(ComplexNum newArg) {
        int RealNum = (frtArg.getRealNum() * newArg.getRealNum()) + (-(frtArg.getImaginNum() * newArg.getImaginNum()));
        int ImaginNum = (frtArg.getRealNum() * newArg.getImaginNum()) + (frtArg.getImaginNum() * newArg.getRealNum());
        frtArg.setRealNum(RealNum); frtArg.setImaginNum(ImaginNum);
        return frtArg;
    }

    /**
     * Метод - деление
     * @param newArg - значения нового аргумента
     */
    public ComplexNum divis(ComplexNum newArg) {
        int frtRealNum = (frtArg.getRealNum() * newArg.getRealNum()) + (-(frtArg.getImaginNum() * (-newArg.getImaginNum())));
        int frtImaginNum = (frtArg.getRealNum() * (-newArg.getImaginNum())) + (frtArg.getImaginNum() * newArg.getRealNum());
        int newRealNum = (newArg.getRealNum() * newArg.getRealNum()) + (-(newArg.getImaginNum() * (-newArg.getImaginNum())));
        frtRealNum /= newRealNum; frtImaginNum /= newRealNum;
        frtArg.setRealNum(frtRealNum); frtArg.setImaginNum(frtImaginNum);
        return frtArg;
    }

    /**
     * Получение значения - резултат
     */
    public ComplexNum getResult() {
        return frtArg;
    }
    
}

    
