package com.calc;

public class ArabicToRoman {
    static final int min = 1;
    static final int max = 100;
    static final String[] RomanI = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    static final String[] RomanX = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    static final String[] RomanC = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};


    public String arabicToRoman(int arabic){

        if(arabic < min || arabic >= max){
            throw new IllegalArgumentException("Значение должно быть от 1 до 100");
        }

        String result = "";

        StringBuilder sb = new StringBuilder();
        sb.append(RomanC[arabic % 1000 / 100]);
        sb.append(RomanX[arabic % 100 / 10]);
        sb.append(RomanI[arabic % 10]);

        result = sb.toString();

        return result;
    }
}
