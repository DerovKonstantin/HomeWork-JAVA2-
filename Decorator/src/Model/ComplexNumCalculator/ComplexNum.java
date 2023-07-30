package Model.ComplexNumCalculator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 * Класс - Комплексные числа
 * @author --
 * @version 1.0
*/
public class ComplexNum {
    /** Поле — действительная часть комплексного числа */
    private int realNum;
    /** Поле — мнимая часть комплексного числа */
    private int imagNum;

    /**
     * Конструктор - создание нового объекта (Комплексное число)
     */
    public ComplexNum() {
    }

    /**
     * Метод - считывает введеную строку и проверяет является ли строка алгебраическим представлением комплексного числа,
     * далее определяет(возвращяет) действительную и мнимую часть комплексного числа
     */
    public void input() {   
        Scanner input = new Scanner(System.in);
        String inputTxt = input.nextLine();
        // Проверяем, является ли строка алгебраическим представлением комплексного числа (1-2i или z=1-2i или z12=1-i*2)
        while (!inputTxt.matches("(.\\d*=)?-?\\d+[+-](\\d+\\*?i|i\\*?\\d+)")){
            System.out.print("Введены неверные данные, введите комплексное число...");
            inputTxt = input.nextLine();
        }
        //убираем из строки все лишнее и оставляем только числа
        inputTxt = inputTxt.replaceAll("(.\\d*=|i\\*?)", "");
        //Задаем паттерн для определения действительного и мнимого числа
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(inputTxt);
        if (matcher.find(0)) { this.realNum = Integer.parseInt(matcher.group()); }
        if (matcher.find(matcher.end())) { this.imagNum = Integer.parseInt(matcher.group()); }
    }

    /**
     * Метод - считывает введеную строку и проверяет является ли строка числом,
     * далее определяет(возвращяет) мнимую часть комплексного числа
     */
    public void inputImaginNum() {
        System.out.println("Введите мнимую часть комплексного числа...");
        Scanner input = new Scanner(System.in);
        String inputTxt = input.nextLine();
        while (!inputTxt.matches("-?(\\d+\\*?i?|i?\\*?\\d+)")){
            System.out.print("Введены неверные данные, введите мнимую часть комплексного числа...");
            inputTxt = input.nextLine();
        }
        inputTxt = inputTxt.replaceAll("i\\*?", "");
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(inputTxt);
        if (matcher.find(0)) { this.imagNum = Integer.parseInt(matcher.group()); }
    }

    /**
     * Метод - считывает введеную строку и проверяет является ли строка числом,
     * далее определяет(возвращяет) действительную часть комплексного числа
     */
    public void inputRealNum(String inputMessage1, String inputMessage2) {
        System.out.println(inputMessage1);//"Введите действительная часть комплексного числа..."
        Scanner input = new Scanner(System.in);
        String inputTxt = input.nextLine();
        while (!inputTxt.matches("-?\\d+")){
            System.out.print(inputMessage2);//"Введены неверные данные, введите действительную часть комплексного числа..."
            inputTxt = input.nextLine();
        }
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(inputTxt);
        if (matcher.find(0)) { this.realNum = Integer.parseInt(matcher.group()); }
    }

    /**
     * Получение значения поля - действительная часть комплексного числа
     */
    public int getRealNum() {
        return realNum;
    }

    /**
     * Определения значения поля - действительная часть комплексного числа
     * @param realNum - действительная часть комплексного числа
     */
    public void setRealNum(int realNum) {
        this.realNum = realNum;
    }

    /**
     * Получение значения поля - мнимая часть комплексного числа
     */
    public int getImaginNum() {
        return imagNum;
    }

    /**
     * Определения значения поля - мнимая часть комплексного числа
     * @param imaginNum - мнимая часть комплексного числа
     */
    public void setImaginNum(int imaginNum) {
        this.imagNum = imaginNum;
    }

    @Override
    public String toString() {
        return  0 < imagNum ? String.format(" %d +%di", realNum, imagNum) 
                            : String.format(" %d %di", realNum, imagNum);
    }

}
