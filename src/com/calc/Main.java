package com.calc;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IllegalArgumentException {
        Calculator calculator = new Calculator();
        String[] input = sc.nextLine().toUpperCase().split(" ");

        boolean firstArabic = isArabic(input[0]);
        boolean secondArabic = isArabic(input[2]);
        String operation = input[1];

        if (firstArabic != secondArabic) {
            throw new IllegalArgumentException("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно");
        } else if ( !firstArabic && !secondArabic) {
            ArabicToRoman atr = new ArabicToRoman();
            System.out.println(atr.arabicToRoman(calculator.calc(input[0], input[2], operation)));
        } else {
            System.out.println(calculator.calc(Integer.parseInt(input[0]), Integer.parseInt(input[2]), operation));
        }

        sc.close();

    }

    public static boolean isArabic(String in){
        try {
            Integer.parseInt(in);
        } catch (Exception e){
            return false;
        }
            return true;
    }


}
