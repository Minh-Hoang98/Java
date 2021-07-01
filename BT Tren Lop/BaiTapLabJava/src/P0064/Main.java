package P0064;

public class Main {
   public static void main(String[] args) {   
       
        System.out.println("===== Validate Program =====");
        String phone = Validate.checkPhone();
        String email = Validate.checkEmail();
        String date = Validate.checkDay();
    }
}
