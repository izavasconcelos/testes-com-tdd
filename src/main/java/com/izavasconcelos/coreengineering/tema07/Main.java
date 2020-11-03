package com.izavasconcelos.coreengineering.tema07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberConverter numberConverter = new NumberConverter();
        Scanner keyBoard = new Scanner(System.in);
        int selectOption, resultRoman;
        String resultInteger;

        do {
            menu();
            selectOption = Integer.parseInt(keyBoard.nextLine());
            switch (selectOption){
                case 1:
                    System.out.println("Insert roman numeral to convert (I to XX): ");
                    resultRoman = numberConverter.romanToInteger(keyBoard.nextLine());
                    if(resultRoman != 0) {
                        System.out.println("The result of roman to integer is: " + resultRoman);
                    } else {
                        System.out.println("Invalid Option!");
                    }
                    break;
                case 2:
                    System.out.println("Insert integer numeral to convert (1 to 20): ");
                    resultInteger = numberConverter.integerToRoman(Integer.parseInt(keyBoard.nextLine()));
                    if(!resultInteger.equals("")) {
                        System.out.println("The result of integer to roman is: " + resultInteger);
                    } else {
                        System.out.println("Invalid Option!");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid Option!");
            }
        }while (selectOption !=0);
        System.out.println("*********** BYE ************ ");
    }

    public static void menu() {
        System.out.println("##### Numbers Converter #####");
        System.out.println("# [ 1 ] Roman To Integer    #");
        System.out.println("# [ 2 ] Integer To Roman    #");
        System.out.println("# [ 0 ] Exit                #");
        System.out.println("#############################");
        System.out.print(">>");
    }

}
