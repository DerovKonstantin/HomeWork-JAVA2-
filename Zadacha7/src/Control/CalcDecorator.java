
package Control;
import Model.Calculator.Logger;

//package Model.Calculator;
import Control.iCalculable;

public class CalcDecorator implements iCalculable {

    private iCalculable oldCalc;
    private Logger logger;
 
    public CalcDecorator(iCalculable oldCalc, Logger logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }


    
    @Override
    public iCalculable sum(int arg) {
       int firstArg = oldCalc.getResult();
       logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода sum с параметром %d", firstArg, arg));
       iCalculable result = oldCalc.sum(arg);
       logger.log(String.format("Вызова метода sum произошел"));

       return result;
    }

    @Override
    public iCalculable multi(int arg) {
       int firstArg = oldCalc.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", firstArg, arg));
        iCalculable result = oldCalc.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public Integer getResult() {
        int result = oldCalc.getResult();
        logger.log(String.format("Получение результата %d", result));
        return result;
    }

    ////////////////////////////////////////////
    @Override
    public iCalculable diff(int arg) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public iCalculable divis(int arg) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
