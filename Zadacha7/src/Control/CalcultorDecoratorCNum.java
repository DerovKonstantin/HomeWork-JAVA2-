package Control;

import Model.Calculator.Logger;
import Model.ComplexNumCalculator.ComplexNum;

public class CalcultorDecoratorCNum implements iCalculableAdapterCNum {

    private iCalculableAdapterCNum oldCalc;
    private Logger logger;
 
    public CalcultorDecoratorCNum(iCalculableAdapterCNum oldCalc, Logger logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

    @Override
    public iCalculableAdapterCNum sum(int arg) {
        ComplexNum firstArg = oldCalc.getResult();
        iCalculableAdapterCNum result = oldCalc.sum(arg);
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода sum с параметром %s", firstArg, oldCalc.getNewArgument()));
        logger.log(String.format("Вызова метода sum произошел"));
        return result;
    }

    @Override
    public iCalculableAdapterCNum multi(int arg) {
        ComplexNum firstArg = oldCalc.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", firstArg, oldCalc.getNewArgument()));
        iCalculableAdapterCNum result = oldCalc.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public iCalculableAdapterCNum diff(int arg) {
        ComplexNum firstArg = oldCalc.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода diff с параметром %d", firstArg, oldCalc.getNewArgument()));
        iCalculableAdapterCNum result = oldCalc.diff(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public iCalculableAdapterCNum divis(int arg) {
        ComplexNum firstArg = oldCalc.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода divis с параметром %d", firstArg, oldCalc.getNewArgument()));
        iCalculableAdapterCNum result = oldCalc.divis(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public ComplexNum getResult() {
        ComplexNum result = oldCalc.getResult();
        logger.log(String.format("Получение результата %s", result));
        return result;
    }

    @Override
    public ComplexNum getNewArgument() {
        ComplexNum result = oldCalc.getNewArgument();
        logger.log(String.format("Получение нового аргумента %s", result));
        return result;
    }
    
}
