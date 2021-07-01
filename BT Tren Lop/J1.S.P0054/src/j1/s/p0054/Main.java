package j1.s.p0054;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
        ArrayList<Contact> lc = new ArrayList();
        lc.add(new Contact(1, "Minh Hoang", "SE1305", "Viet Nam", "12347890", "Minh", "Hoang"));
        lc.add(new Contact(2, "Minh Vu", "SE1305", "Viett Nam", "1234890", "Minh", "Vu"));
        while(true){
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.createContact(lc);
                    break;
                case 2:
                    Manager.printAllContact(lc);
                    break;
                case 3:
                    Manager.deleteContact(lc);
                    break;
                case 4:
                    return;
            }
        }
    }
}
