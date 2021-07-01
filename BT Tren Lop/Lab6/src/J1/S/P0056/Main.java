
package J1.S.P0056;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Work> work = new ArrayList();
        ArrayList<History> htr = new ArrayList();
        while(true){
            int choice = Manager.menu();
            switch(choice){
                case 1 : Validate.addWorker(work); break;
                case 2 : Validate.changeSalary(work, htr, 1); break;
                case 3 : Validate.changeSalary(work, htr, 2); break;
                case 4 : Validate.show(htr); break;
                case 5 : System.exit(0); 
            }
        }
    }
}
