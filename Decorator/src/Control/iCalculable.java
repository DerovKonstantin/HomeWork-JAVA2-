package Control;

import Model.ComplexNumCalculator.ComplexNum;

/** 
 * Интерфейс - Вычисления
 * @version 1.0
*/
public interface iCalculable {
    
    /**
     * Метод - сложение
     * @param arg - значения нового аргумента
     */
    iCalculable sum(int arg);

    /**
     * Метод - вычетание
     * @param arg - значения нового аргумента
     */
    iCalculable diff(int arg);

    /**
     * Метод - умножение
     * @param arg - значения нового аргумента
     */
    iCalculable multi(int arg);

    /**
     * Метод - деление
     * @param arg - значения нового аргумента
     */
    iCalculable divis(int arg);

    /**
     * Получение значения - резултат
     * @param <T>
     */
    <T> T getResult();
    
}
