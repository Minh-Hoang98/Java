package Bai4;

public class Bai4 {

    public static final String BASE = "0123456789ABCDEFGHIJKLMNOPQRSTUVXYZW";
    public static final float b = 00000000;

    public static String result(int n, int b) {
        StringBuilder stringBuilder = new StringBuilder();
        int x = 0;
        while (n > 0) {
            x = n % b;
            n /= b;
            stringBuilder.append(BASE.charAt(x));
        }
        
        return stringBuilder.reverse().toString();
    }

}
