package com.calc;

public class ArabicToRoman {
    static final int min = 1;
    static final int max = 90;
    static final String[] RomanXXX = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    static final String[] RomanX = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public String arabicToRoman(int arabic){

        if(arabic < min || arabic >= max){
            throw new IllegalArgumentException("Значение должно быть от 1 до 90");
        }

        String result = "";

        StringBuilder sb = new StringBuilder();
        sb.append(RomanXXX[arabic % 100 / 10]);
        sb.append(RomanX[arabic % 10]);

        result = sb.toString();

        return result;
    }
}
