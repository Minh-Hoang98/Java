
package J1.S.P0057;

public class Main {
    public static void main(String[] args) {
        while(true){
            int choice = Manager.menu();
            switch(choice){
                case 0: System.out.println("Thank You");
                        System.exit(0);
                case 1: Manager.createNewAccount(); break;
                case 2: Manager.loginSystem(); break;
                
            }
        }
    }
}
