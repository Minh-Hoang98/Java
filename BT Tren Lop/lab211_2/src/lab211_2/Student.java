package lab211_2;

public class Student implements Comparable<Student> {

    private int idNames;
    private String names;
    private String addresses;
    private int priorities;

    public Student() {
    }

    public Student(int idNames, String names, String addresses, int priorities) {
        this.idNames = idNames;
        this.names = names;
        this.addresses = addresses;
        this.priorities = priorities;
    }

    public int getIdNames() {
        return idNames;
    }

    public void setIdNames(int idNames) {
        this.idNames = idNames;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }

    public int getPriorities() {
        return priorities;
    }

    public void setPriorities(int priorities) {
        this.priorities = priorities;
    }

    public String toString() {
        return this.idNames + "\t" + this.names + "\t" + this.addresses + "\t    " + this.priorities;
    }
    
    @Override
    public int compareTo(Student o) {
        return this.names.compareToIgnoreCase(o.names);
    }
}
