package Worker;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Worker> lw = new ArrayList<>();
        ArrayList<History> lh = new ArrayList<>();

        while(true){
            int choice = Manager.menu();
            switch(choice){
                case 1: 
                    Manager.addWorker(lw);
            }
        }
    }
}
