package com.calc;

public class Calculator {

    public int calc(String firstOp, String secondOp, String operation){
        int result = 0;
        try {
            RomanToArabic rta = new RomanToArabic();
            result = calc( rta.romanToArabic(firstOp), rta.romanToArabic(secondOp), operation );
        } catch (Exception e){
        }
        return result;
    }

    public int calc(int firstOp, int secondOp, String operation){
        int result = 0;
        switch (operation){
            case "+":
                result = firstOp + secondOp;
                break;
            case "-":
                result = firstOp - secondOp;
                break;
            case "*":
                result = firstOp * secondOp;
                break;
            case "/":
                result = firstOp / secondOp;
                break;
            default:
                throw new IllegalArgumentException("Операция " + operation.toString() + " не поддерживается");
        }

        return result;
    }

}
