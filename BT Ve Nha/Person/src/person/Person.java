package person;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Person {

    public String getname();

    public void setname(String name);
}

interface person2 extends Person {

    public String getphone();

    public void setphone(String phone);
}

class student implements person2 {

    String name;
    String mail;
    String phone;
    public student(){}
    public student(String name, String mail, String phone) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
    }
    @Override
    public String getname() {
        return name;
    }

    @Override
    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String getphone() {
        return phone;
    }

    @Override
    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getmail() {
        return mail;
    }

    public void setmail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Student[Name: " + name + ", Mail: " + mail + ", Phone: " + phone + "]";
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Minh Hoang";
        s1.mail = "hoangvnmde130119@gmail.com";
        String reg = "^[\\w-_\\.]+\\@[\\w&&[^0-9]]+\\.[\\w&&[^0-9]]+$";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(s1.mail);
        if (matcher.matches()) {
            System.out.println("Email: " + s1.mail + ": Accepted!");
        } else {
            System.out.println("Not accepted! ");
        }

        s1.phone ="0355705499";
        String reg1 = "[^0-9]";
        Pattern pattern1 = Pattern.compile(reg1);
        Matcher matcher1 = pattern1.matcher(s1.phone);
        if (matcher.matches()) {
            System.out.println("Phone: " + s1.phone + ": Accepted!");
        } else {
            System.out.println("Not accepted! ");
        }

        System.out.println(s1.toString());
    }
}