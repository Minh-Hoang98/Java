
package J1.S.P0058;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap();
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    Manager.addNewWord(hm);
                    break;
                case 2:
                    Manager.deleteWord(hm);
                    break;
                case 3:
                    Manager.translate(hm);
                    break;
            }
        }
    }

}
