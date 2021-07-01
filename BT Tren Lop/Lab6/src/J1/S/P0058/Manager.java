package J1.S.P0058;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Manager {

    private static final Scanner sc = new Scanner(System.in);

    public static int menu() {
        System.out.println("====================Menu=====================");
        System.out.println("1.Add new word.");
        System.out.println("2.Delete word.");
        System.out.println("3.Search word.");
        System.out.println("0.Exit.");
        System.out.println("=============================================");
        System.out.println("Enter your choice: ");
        int c = Validate.checkInputLimit(0, 3);
        return c;
    }

    public static void addNewWord(HashMap<String, String> Hm) {
        System.out.print("Enter English: ");
        String Eng = Validate.checkInputString();
        if (!Validate.checkKeywordExist(Hm, Eng)) {
            if (!Validate.checkInputYN()) {
                return;
            }
        }
        System.out.print("Enter VietNamese: ");
        String Vie = Validate.checkInputString();
        Hm.put(Eng, Vie);
        System.err.println("Add Successful.");

    }

    public static void deleteWord(HashMap<String, String> Hm) {
        System.out.print("Enter English: ");
        String Eng = Validate.checkInputString();
        Hm.remove(Eng);
        System.err.print("Delete Successful.");
        System.out.println("");
    }

    public static void translate(HashMap<String, String> Hm) {
        System.out.print("Enter English: ");
        String Eng = Validate.checkInputString();
        Set<Map.Entry<String, String>> Entries = Hm.entrySet();
        for (Map.Entry entry : Entries) {
            if (entry.getKey().equals(Eng)) {
                System.out.print("Vietnamese: " + entry.getValue());
                System.out.println("");
                return;
            }
        }
        System.err.print("Not found in data");
    }

}
