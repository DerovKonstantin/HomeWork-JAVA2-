package View;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Control.iCalculable;
import java.util.Scanner;

/** 
 * Класс - Вид калькулятора
 * @author --
 * @version 1.0
*/
public class ViewCalculator {
    /** Поле - Интерфейс - Вычисления */
    private iCalculable calculator;

    /**
     * Конструктор - создание нового объекта (Вид калькулятора)
     * @param calculator - Интерфейс - Вычисления
     */
    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    /**
     * Метод - запускает цикл ввода команд калькулятра
     */
    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите первый аргумент: ");
            calculator.sum(primaryArg);
            //iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
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

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }

}
