
package J1.S.P0056;

import java.util.ArrayList;

public class History extends Work{
    private String status;
    private String date;

    public History(String status,String date,String id, String name, int age, int salary, String workLocation) {
        super(id, name, age, salary, workLocation);
        this.status = status;
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void displayHistory(ArrayList<History> H){
        
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n",this.status,this.getId(),
                    this.getName(),this.getAge(),this.getSalary(),this.getWorkLocation(),this.date);
    }
        
    }
    
    

