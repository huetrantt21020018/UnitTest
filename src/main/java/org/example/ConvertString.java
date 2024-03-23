package org.example;

public class ConvertString {
    public static String convert(String s) {
        String t = "";
        for(int i = 0; i < s.length(); i++) {
            char d = '0';
            switch (s.charAt(i)) {
                case 'A':
                    d = '1';
                    break;
                case 'B':
                    d = '2';
                    break;
                case 'C':
                    d = '3';
                    break;
            }
            t += d;
        }
        return t;
    }

}
