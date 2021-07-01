
package employee;


public class Employee implements Comparable<Employee>{
    private String id;
    private String item;
    private int quantity;
    private int rate;

    public Employee() {
    }

    public Employee(String id, String item, int quantity, int rate) {
        this.id = id;
        this.item = item;
        this.quantity = quantity;
        this.rate = rate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

     @Override
    public String toString() {
        System.out.printf("%-10s%-20s%-10d%-10d", this.id, this.item, this.quantity,this.rate);
        return "";
    }
    @Override
    public int compareTo(Employee o) {
        return this.id.compareTo(o.id);
    }
    

     
}
