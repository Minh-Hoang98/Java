package view;

import model.User;
import static model.User.login;

public class Library {

    public static void main(String[] args) {
        User a = new User("U0001");
        System.out.println(a);
        a.logout();
    }
    
}
