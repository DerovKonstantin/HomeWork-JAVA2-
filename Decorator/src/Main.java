import java.net.SocketPermission;

import Control.iCalculable;
import Control.iCalculableAdapterCNum;
import Model.Calculator.Calculator;
import Control.CalcDecorator;
import Control.CalculatorAdapterCNum;
import Control.CalcultorDecoratorCNum;
import Model.Calculator.Logger;
import Model.ComplexNumCalculator.ComplexNum;
import Model.ComplexNumCalculator.ComplexNumCalculator;
import View.ViewCNumCalculator;
import View.ViewCalculator;


// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {

        // // проверяем работ калькулятора
        // iCalculable calculator = new Calculator(0);
        // iCalculable newCalcLog = new CalcDecorator(calculator, new Logger());
        // ViewCalculator view = new ViewCalculator(newCalcLog);
        // view.run();

        // //Проверяю раюоту калькулятора/адаптера Комплексных чисел
        // ComplexNum Num1 = new ComplexNum();
        // ComplexNum Num2 = new ComplexNum();
        // ComplexNumCalculator cNC =  new ComplexNumCalculator(Num1);
        // CalculatorAdapterCNum cACN = new CalculatorAdapterCNum(Num1, Num2, cNC);
        // Num1.setRealNum(-4);
        // Num1.setImaginNum(2);
        // Num2.setRealNum(1);
        // Num2.setImaginNum(-3);
        // // Калькулятора Комплексных чисел
        // cNC.sum(Num2);
        // //cNC.diff(Num2);
        // //cNC.multi(Num2);
        // //cNC.divis(Num2);
        // // Адаптера Комплексных чисел
        // //cACN.sum(Num2.getRealNum());
        // //cACN.diff(Num2.getRealNum());
        // //cACN.divis(Num2.getRealNum());
        // //cACN.multi(Num2.getRealNum());
        // System.out.println("==============");
        // System.out.println(Num1.toString());
        // System.out.println("==============");

        ComplexNum frtСNum = new ComplexNum();
        ComplexNum nxtCNum = new ComplexNum();
        ComplexNumCalculator cNumCal = new ComplexNumCalculator(frtСNum);
        iCalculableAdapterCNum calculatorACNum = new CalculatorAdapterCNum(frtСNum, nxtCNum, cNumCal);
        iCalculableAdapterCNum newCalcLog = new CalcultorDecoratorCNum(calculatorACNum, new Logger());
        ViewCNumCalculator viewCNumCalculator =  new ViewCNumCalculator(frtСNum, nxtCNum, newCalcLog);
        //ViewCNumCalculator viewCNumCalculator =  new ViewCNumCalculator(frtСNum, nxtCNum, calculatorACNum);
        viewCNumCalculator.run();

    }
}
