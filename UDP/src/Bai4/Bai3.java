package Bai4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bai3 {

    public static final String BASE = "0123456789ABCDEFGHIJKLMNOPQRSTUVXYZW";
    public static final float b = 00000000;

    public String result(int n, int b) {
        StringBuilder stringBuilder = new StringBuilder();
        int x = 0;
        while (n > 0) {
            x = n % b;
            n /= b;
            stringBuilder.append(BASE.charAt(x));
        }

        return stringBuilder.reverse().toString();
    }
    public static String convert(int num, int base) {
        String string = new String();
        while(num>0) {
            string = "0123456789ABCDEF".charAt(num%base) + string;
            num = num/base;
        }
        while(base==2&&string.length()<8){
            string="0"+string;
        }
        return string;
    }
}
