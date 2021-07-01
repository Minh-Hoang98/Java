
package J1.S.P0056;

public class Work {
    private String id;
    private String name;
    private int age;
    private int salary;
    private String workLocation;

    public Work(String id, String name, int age, int salary, String workLocation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }
    public void display(){
       System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","Id","Name","Age","Salary","Work Location"
               ,this.id,this.name,this.age,this.salary,this.workLocation);
       
   }
   
}
