package com.calc;

public class RomanToArabic {

    public int romanToArabic(String roman){

        int result = 0;

        char[] chars = roman.toUpperCase().toCharArray();

        for (int i=0; i < chars.length; i++){
            switch (chars[i]){
                case 'X':
                    result += 10;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'I':
                    result += 1;
                    break;
                default:
                    throw new IllegalArgumentException("Не поддерживаются римские цифры больше Х");
            }
        }

        return result;

    }

}
