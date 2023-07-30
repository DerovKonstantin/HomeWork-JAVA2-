package View;

import java.util.Scanner;

import Control.iCalculable;
import Model.ComplexNumCalculator.ComplexNum;

/** 
 * Класс - Вид калькулятора комплексных чисел
 * @author --
 * @version 1.0
*/
public class ViewCNumCalculator {
    /** Поле - значения первичного аргумента(Класс - Комплексные числа) */
    private ComplexNum frtСNum ;
    /** Поле - значения нового аргумента(Класс - Комплексные числа) */
    private ComplexNum nxtCNum ;

    /** Поле - Калькулятор адаптер комплексных чисел */
    private iCalculable calculatorACNum ;
    
    
    // /**
    //  * Конструктор - создание нового объекта (Вид калькулятора комплексных чисел)
    //  * @param calculator - Интерфейс - Вычисления
    //  * @param calculatorACNum - Калькулятор адаптер комплексных чисел
    //  */
    public ViewCNumCalculator(ComplexNum frtСNum, ComplexNum nxtCNum, iCalculable calculatorACNum) {//ComplexNum cNum, 
        this.frtСNum = frtСNum;
        this.nxtCNum = nxtCNum;
        this.calculatorACNum = calculatorACNum;
    }
    
    /**
     * Метод - запускает цикл ввода команд калькулятра...
     */
    public void run() {
        while (true) {
            String inputMessage1 = "Введите действительную часть первого комплексного числа...";
            String inputMessage2 = "Введены неверные данные, введите действительную часть комплексного числа...";
            String inputMessage3 = "Введите действительную часть следующего комплексного числа...";
            frtСNum.inputRealNum(inputMessage1, inputMessage2);
            calculatorACNum.sum(0);
            while (true) {
                String cmd = prompt("Введите команду (*, +, -, /, =) : ");
                if (cmd.equals("*")) {
                    nxtCNum.inputRealNum(inputMessage3, inputMessage2);
                    calculatorACNum.multi(nxtCNum.getRealNum());
                    continue;
                }
                if (cmd.equals("+")) {
                    nxtCNum.inputRealNum(inputMessage3, inputMessage2);
                    calculatorACNum.sum(nxtCNum.getRealNum());
                    continue;
                }
                if (cmd.equals("-")) {
                    nxtCNum.inputRealNum(inputMessage3, inputMessage2);
                    calculatorACNum.diff(nxtCNum.getRealNum());
                    continue;
                }
                if (cmd.equals("/")) {
                    nxtCNum.inputRealNum(inputMessage3, inputMessage2);
                    calculatorACNum.divis(nxtCNum.getRealNum());
                    continue;
                }

                if (cmd.equals("=")) {
                    System.out.printf("Результат %s\n", frtСNum);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}
