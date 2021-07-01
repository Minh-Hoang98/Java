public class Employee {
    String empCode, empName, empSalary;
    
    public Employee() {
    }

    public Employee(String empCode, String empName) {
        this.empCode = empCode;
        this.empName = empName;
    }
    
    public Employee(String empCode, String empName, String empSalary) {
        this.empCode = empCode;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public String getEmpCode() {
        return empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }
    
    @Override
    public String toString() {
        return empCode + " - " + empName;
    }
}
