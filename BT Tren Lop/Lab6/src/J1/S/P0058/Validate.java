package J1.S.P0058;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Validate {

    private static final Scanner sc = new Scanner(System.in);

    public static int checkInputLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (Exception e) {
                System.err.println("Please input " + min + " to " + max + "");
                System.out.print("Enter Again");
            }
        }
    }

    public static String checkInputString() {
        String s = sc.nextLine().trim();
        return s;
    }

    public static boolean checkKeywordExist(HashMap<String, String> Hm, String Eng) {

        Set set = Hm.entrySet();
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Map.Entry mentry = (Map.Entry) iter.next();

            if (Eng.equalsIgnoreCase(mentry.getKey().toString())) {
                return false;
            }

        }
        return true;

    }

    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();

            if (result.equalsIgnoreCase("Y")) {
                return true;
            }

            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
}
