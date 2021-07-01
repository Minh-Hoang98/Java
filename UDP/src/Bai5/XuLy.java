package Bai5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class XuLy {

    public static String convert(int num, int base) {
        String string = new String();
        while (num > 0) {
            string = "0123456789ABCDEF".charAt(num % base) + string;
            num = num / base;
        }
        while (base == 2 && string.length() < 8) {
            string = "0" + string;
        }
        return string;
    }

    public String Chuoi() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        return s;
    }

    public static char toUpper(char c) {
        int tmp = (int) c;
        tmp = tmp - 32;
        return (char) tmp;
    }

    public static char toLower(char c) {
        int tmp = (int) c;
        tmp = tmp + 32;
        return (char) tmp;
    }

    public static String daonguoc(String str) {
        int i = 0;
        int localI = i++;
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }

        String reversed = daonguoc(str.substring(1)) + str.charAt(0);

        return reversed;
    }

    public static String chuoihoa(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122) {
                tmp = toUpper(str.charAt(i));
            }
            result = result + tmp;
        }
        return result;
    }

    public static String chuoithuong(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90) {
                tmp = toLower(str.charAt(i));
            }
            result = result + tmp;
        }
        return result;
    }

    public static String chuoimix(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90) {
                tmp = toLower(str.charAt(i));
            }
            if ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122) {
                tmp = toUpper(str.charAt(i));
            }
            result = result + tmp;
        }
        return result;
    }

    public static String dem(String str) {
        if (str.equals("")) {
            return String.valueOf(0);
        }
        int d = 1;
        boolean check = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                check = true;
            }
            if (check && str.charAt(i) != ' ') {
                check = false;
                d++;
            }
        }
        return String.valueOf(d);
    }

    
}
