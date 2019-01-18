package lesson7;

import java.util.Scanner;

public class Calculator {
    public static int getint() {
        System.out.println("введите число");
        Scanner scanner = new Scanner(System.in);
        String inputnumber = scanner.nextLine();
        char[] inputnumberstocgar = inputnumber.toCharArray();
        for (int i = 0; i < inputnumberstocgar.length; i++) {
            char currentChar = inputnumberstocgar[i];
            if (currentChar != '0' && currentChar != '1' && currentChar != '2' && currentChar != '3' && currentChar != '4'
                    && currentChar != '5' && currentChar != '6' && currentChar != '7' && currentChar != '8' && currentChar != '9') {
                System.out.println("Єто не число! Повторите ввод");
                return Calculator.getint();
            }


        }
        int nn = Integer.parseInt(inputnumber);
        return nn;
    }

    public static char getOperation() {
        System.out.println("введите операцию");
        Scanner scanner = new Scanner(System.in);
        String inputnoperator = scanner.nextLine();
        char[] inputnumberstocgar = inputnoperator.toCharArray();
        if (inputnumberstocgar.length > 1) {
            System.out.println("Это не оператор! повторите ввод");
            return Calculator.getOperation();

        }


        char currentChar = inputnumberstocgar[0];
        if (currentChar != '+' && currentChar != '*' && currentChar != '/' && currentChar != '-') {
            System.out.println("Єто не оператор! Повторите ввод");
            return Calculator.getOperation();
        }

        return currentChar = inputnumberstocgar[0];


    }


    public static double calc(int Numner1, int Number2, char operator) {

        if (operator == '*') {
            return Numner1 * Number2;
        }
        if (operator == '+') {
            return Numner1 + Number2;
        }
        if (operator == '-') {
            return Numner1 - Number2;

        }
        return Numner1 / Number2;

    }
}





