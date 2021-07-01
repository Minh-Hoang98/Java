
package employee;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;

    public Employee(int id,String firstName,String lastName,int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getID(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName +" " + lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }
    public int raiseSaraly(int percent){
        return salary * percent;
    }
    @Override
    public String toString(){
        return "Employee[ id = " + id + " Name: " + getName() +" Salary: " + salary;
    }
    public static void main(String[] args) {
        Employee a1 = new Employee(1,"Hoang","Vuong",17000);
        System.out.println(a1);
        System.out.println("Salary after raise:  " + a1.raiseSaraly(2));
        Employee a2 = new Employee(2,"Long","Pham",15000);
        System.out.println(a2);
        System.out.println("AnnualSalary: " + a2.getAnnualSalary());
    }
    
}
