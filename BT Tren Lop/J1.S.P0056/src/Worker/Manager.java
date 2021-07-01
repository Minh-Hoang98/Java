package Worker;

import java.util.ArrayList;

public class Manager {

    public static int menu() {
        System.out.println("1.Add worker.");
        System.out.println("2.Increase salary for worker.");
        System.out.println("3.Decrease for worker.");
        System.out.println("4.Show adjusted salary worker information.");
        System.out.println("5.Exist.");
        System.out.println("Enter your choice: ");
        int choice = Validate.checkInputIntLimit(1, 5);
        return choice;
    }

    public static void addWorker(ArrayList<Worker> lw) {
        System.out.print("Enter code: ");
        String id = Validate.checkInputString();
        if (!Validate.checkIdExist(lw, id)) {
            System.err.println("Code(id) must be existed in DB.");
            return;
        }
        System.out.print("Enter name: ");
        String name = Validate.checkInputString();
        System.out.print("Enter age: ");
        int age = Validate.checkInputIntLimit(18, 50);
        System.out.print("Enter salary: ");
        int salary = Validate.checkInputSalary();
        System.out.print("Enter work location: ");
        String workLocation = Validate.checkInputString();
        if (!Validate.checkWorkerExist(lw, id, name, age, salary, workLocation)) {
            System.err.println("Duplicate.");
        } else {
            lw.add(new Worker(id, name, age, salary, workLocation));
            System.err.println("Add success.");
        }
    }

    public static void changeSalary(ArrayList<Worker> lw, ArrayList<History> lh, int status) {
        if (lw.isEmpty()) {
            System.out.println("List empty.");
            return;
        }
        System.out.print("Enter code: ");
        String id = Validate.checkInputString();
        Worker worker = getWorkerByCode(lw, id);
        if (worker == null) {
            System.out.println("Not exit worker.");
        } else {
            int salaryCurrent = worker.getSalary();
            int salaryUpdate;
            if (status == 1) {
                System.out.print("Enter salary: ");
                while (true) {
                    salaryUpdate = Validate.checkInputSalary();
                    if (salaryUpdate <= salaryCurrent) {
                        System.err.println("Must be greater than current salary.");
                        System.out.println("Enter again: ");
                    } else {
                        break;
                    }
                }
                lh.add(new History("UP", getCurrentData(), worker.getId(),
                                    worker.getName(), worker.getAge(), salaryUpdate, 
                                    worker.getWorkLocation()));
            }else{
                System.out.println("Enter salary: ");
                while(true){
                    salaryUpdate = Validate.checkInputSalary();
                    if(salaryUpdate >= salaryCurrent){
                        System.err.println("Must be smalller than current salary.");
                        System.out.println("Enter again: ");
                    }else{
                        break;
                    }
                }
                lh.add(new History("DOWN",getCurrentData(), worker.getId(),
                                    worker.getName(), worker.getAge(), salaryUpdate, 
                                    worker.getWorkLocation()));
            }
            worker.setSalary(salaryUpdate);
            System.err.println("Update success.");
        }
    }

    private static Worker getWorkerByCode(ArrayList<Worker> lw, String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
