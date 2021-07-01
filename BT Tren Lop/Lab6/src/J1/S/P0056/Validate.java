
package J1.S.P0056;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Validate {

    static void addWorker(ArrayList<Work> w) {
        System.out.print("Enter Id: ");
        String id = Manager.checkInputString();
        System.out.print("Enter Name: ");
        String name = Manager.checkInputString();
        System.out.print("Work Location: ");
        String workL = Manager.checkInputString();
        System.out.print("Enter Age: ");
        int age = Manager.checkInputInt();
        System.out.print("Enter Salary: ");
        int salary = Manager.checkInputInt();
        System.err.println("Add Successful");

        w.add(new Work(id, name, age, salary, workL));
        System.out.printf("Display Information: \n%-10s%-10s%-20s%-10s%-10s\n","Id","Name","Work Location","Age","Salary");
        for(Work w1 : w){
            System.out.printf("%-10s%-10s%-20s%-10s%-10s",id,name,workL,age,salary);
        }
        return;
    }

    static void changeSalary(ArrayList<Work> w, ArrayList<History> h, int status) {
        if (w.isEmpty()) {
            System.out.println("List Empty.");
            return;
        }
        while (true) {
            System.out.print("Enter Id: ");
            String id = Manager.checkInputString();
            for (Work w1 : w) {
                if (w1.getId().equalsIgnoreCase(id)) {
                    int salaryCurent = w1.getSalary();
                    int salaryUpdate;
                    if (status == 1) {
                        System.out.print("Enter Salary: ");
                        while (true) {
                            salaryUpdate = Manager.checkSalary();
                            if (salaryUpdate <= salaryCurent) {
                                System.err.println("Salary must be greater than Curent");
                                System.out.print("Enter Again: ");
                            } else {
                            w1.setSalary(salaryUpdate);
                            System.out.println("Update Successful");
                            h.add(new History("UP", getCurrentDate(), w1.getId(), w1.getName(), w1.getAge(),
                                    w1.getSalary(), w1.getWorkLocation()));
                            return;
                            }
                        }
                    } else {
                        System.out.print("Enter Salary: ");
                        while (true) {
                            salaryUpdate = Manager.checkSalary();
                            if (salaryUpdate >= salaryCurent) {
                                System.err.println("Must be smaller than current salary.");
                                System.out.print("Enter again: ");
                            } else {
                                w1.setSalary(salaryUpdate);
                                System.out.println("Update Successful");
                                h.add(new History("DOWN", getCurrentDate(), w1.getId(), w1.getName(), w1.getAge(),
                                        w1.getSalary(), w1.getWorkLocation()));
                             return;
                            }
                        }
                    }
                }
            }
            System.err.println("Not Found!!!");
            System.out.println("Enter Again");
        }
    }

    static String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Calendar calendar = Calendar.getInstance();
        return dateFormat.format(calendar.getTime());
    }

    static void show(ArrayList<History> H) {
        if (H.isEmpty()) {
            System.out.println("List is Empty");
        } else {
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Status", "ID",
                    "Name", "Age", "Salary", "Work Location", "Date");
        }

        for (History H1 : H) {
            H1.displayHistory(H);
        }
        
        
    }
}
