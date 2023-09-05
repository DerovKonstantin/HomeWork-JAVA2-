package Model;

import java.io.Serializable;
import java.util.Scanner;

/** 
 * Класс - критерии ввода(проверка корректности ввода)
 * @author --
 * @version 1.0
*/
public class CheckInput implements Serializable {

    /** поле - класс - идентификатор игрушки */
    private IdToy idToy;

    /**
     * Метод - считывает введеную строку и возвращяет ее без проверок
     * @param txt - задаваемя команда
     */
    public String NameToy(String txt) {  
        System.out.println(txt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * Метод - считывает введеную строку и проверяет является ли строка числом 
     * в диапазоне от 1 до 100
     * @param txt - задаваемя команда
     */
    public int DropChance(String txt) {  
        System.out.println(txt);
        Scanner input = new Scanner(System.in);
        String inputTxt = input.nextLine();
        while (!inputTxt.matches("([1-9]|[1-9][0-9]|100)")){
            System.out.println("Введены неверные данные!");
            System.out.println(txt);
            inputTxt = input.nextLine();
        }
        return Integer.parseInt(inputTxt);
    }

    /**
     * Метод - считывает введеную строку и проверяет является ли строка числом 
     * в диапазоне от 100000 до 110000 (идентификационным номеом из имеющихся)
     * @param txt - текст задаваемой команды
     * @param idToy - класс - идентификатор игрушки
     */
    public int id(String txt, IdToy idToy) {   
        System.out.print(txt);
        Scanner input = new Scanner(System.in);
        String inputTxt = input.nextLine();
        while (true){
            while (!inputTxt.matches("(1[0-1][0-9][0-9][0-9][0-9]|110000)")){
                System.out.println("Введены неверные данные!1");
                System.out.println(txt);
                inputTxt = input.nextLine();
            }
            if (idToy.сheckId(Integer.parseInt(inputTxt))){
                return Integer.parseInt(inputTxt);
            }
            System.out.println("Введены неверные данные!2");
            System.out.println(txt);
            inputTxt = input.nextLine();
        }
    }
    
}
