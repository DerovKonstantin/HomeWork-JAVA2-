package Control;

import Model.ComplexNumCalculator.ComplexNum;

/** 
 * Интерфейс - Расчетное комплексное число
 * @version 1.0
*/
public interface iCalculableAdapterCNum extends iCalculable {

    /**
     * Метод - сложение
     * @param arg - значения нового аргумента
     */
    public iCalculableAdapterCNum sum(int arg);

    /**
     * Метод - вычетание
     * @param arg - значения нового аргумента
     */
    public iCalculableAdapterCNum diff(int arg);

    /**
     * Метод - умножение
     * @param arg - значения нового аргумента
     */
    public iCalculableAdapterCNum multi(int arg);

    /**
     * Метод - деление
     * @param arg - значения нового аргумента
     */
    public iCalculableAdapterCNum divis(int arg);

    /**
     * Получение значения - резултат
     */
    public ComplexNum getResult();

    /**
     * Получение значения - новый аргумент
     */
    public ComplexNum getNewArgument();


    
}
