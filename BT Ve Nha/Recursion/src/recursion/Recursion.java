package recursion;

import java.io.IOException;

public class Recursion {

    public static void reverse() throws IOException {
        char ch = (char) System.in.read();
        if (ch != '\n') {
            reverse();
            System.out.print(ch);
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("\nEnter a String to be reversed: ");
        reverse();
        System.out.println("\n");
    }
}
