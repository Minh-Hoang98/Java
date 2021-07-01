
package bai3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Chuoi {
    public static String chuoiDao(String st){
        
        String reverse = new StringBuffer(st).
        reverse().toString();
        return reverse;
    }
    public static String chuoihoa(String st) {
        String result = "";
        for (int i = 0; i < st.length(); i++) {
            char tmp = st.charAt(i);
            if ((int) st.charAt(i) >= 97 && (int) st.charAt(i) <= 122) {
                tmp = toUpper(st.charAt(i));
            }
            result = result + tmp;
        }
        return result;
    }

    public static String chuoithuong(String st) {
        String result = "";
        for (int i = 0; i < st.length(); i++) {
            char tmp = st.charAt(i);
            if ((int) st.charAt(i) >= 65 && (int) st.charAt(i) <= 90) {
                tmp = toLower(st.charAt(i));
            }
            result = result + tmp;
        }
        return result;
    }

    public static String hoathuong(String st) {
        String result = "";
        for (int i = 0; i < st.length(); i++) {
            char tmp = st.charAt(i);
            if ((int) st.charAt(i) >= 65 && (int) st.charAt(i) <= 90) {
                tmp = toLower(st.charAt(i));
            }
            if ((int) st.charAt(i) >= 97 && (int) st.charAt(i) <= 122) {
                tmp = toUpper(st.charAt(i));
            }
            result = result + tmp;
        }
        return result;
    }

    public static String soTu(String st) {
        if (st.equals("")) {
            return String.valueOf(0);
        }
        int d = 1;
        boolean check = false; // kiem tra su kien gap khoang trang
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ' ') {
                check = true;
            }
            // khi gap ki tu khac khoang trong
            if (check && st.charAt(i) != ' ') {
                check = false;
                d++;
            }
        }
        return String.valueOf(d);
    }

    public static int[] nguyenam(String st) {
        int[] arr = new int[257]; // arr[256] = so luong nguyen am

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'U' && arr[85] == 0) {
                arr[85]++;
                arr[256]++;
            }
            if (st.charAt(i) == 'E' && arr[69] == 0) {
                arr[69]++;
                arr[256]++;
            }
            if (st.charAt(i) == 'O' && arr[79] == 0) {
                arr[79]++;
                arr[256]++;
            }
            if (st.charAt(i) == 'A' && arr[65] == 0) {
                arr[65]++;
                arr[256]++;
            }
            if (st.charAt(i) == 'I' && arr[73] == 0) {
                arr[73]++;
                arr[256]++;
            }
            if (st.charAt(i) == 'u' && arr[117] == 0) {
                arr[117]++;
                arr[256]++;
            }
            if (st.charAt(i) == 'e' && arr[101] == 0) {
                arr[101]++;
                arr[256]++;
            }
            if (st.charAt(i) == 'o' && arr[111] == 0) {
                arr[111]++;
                arr[256]++;
            }
            if (st.charAt(i) == 'a' && arr[97] == 0) {
                arr[97]++;
                arr[256]++;
            }
            if (st.charAt(i) == 'i' && arr[105] == 0) {
                arr[105]++;
                arr[256]++;
            }
        }
        return arr;
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

    public static String nguyenam1(String st) {
        int i, length, vowelsa = 0, vowelse = 0, vowelsi = 0, vowelso = 0, vowelsu = 0;
        String j;
        length = st.length();
        for (i = 0; i < length; i++) {

            char tmp = st.charAt(i);

            if (tmp == 'a' || tmp == 'A') {
                vowelsa++;
            } else if (tmp == 'e' || tmp == 'E') {
                vowelse++;
            } else if (tmp == 'i' || tmp == 'I') {
                vowelsi++;
            } else if (tmp == 'o' || tmp == 'O') {
                vowelso++;
            } else if (tmp == 'u' || tmp == 'U') {
                vowelsu++;
            }
            
        }
        String sa = String.valueOf(vowelsa);
        String se = String.valueOf(vowelse);
        String si = String.valueOf(vowelsi);
        String so = String.valueOf(vowelso);
        String su = String.valueOf(vowelsu);
        String stt="a: "+sa+" || e: "+se+" || i: "+si+" || o: "+so+" || u: "+su;
        return stt;
    }
}
