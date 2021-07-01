
package customer;

public class Customer {
    public int custId;
    public String custName;
    private int custIdPrivate; 
    protected int custIdProtected; 
    int custIdDefault;
    public Customer() {
        this.custId = 1;
        this.custName = "Ha";
        this.custIdPrivate = 1;
        this.custIdProtected = 1;
        this.custIdDefault = 1;
        this.print();
    }
    public Customer(int custId, String custName) {
        this.custId = custId;
        this.custName = custName;
        this.custIdPrivate = custId;
        this.custIdProtected = custId;
        this.custIdDefault = custId;
        this.print();
    }

    public void print() {
        System.out.println("Class customer [custId: "+ custId + ", custName: " + custName + "]");
    }
    public class Address {
        public int number;
        public String street;
        public String city;
        private int numberPrivate;
        protected int numberProtected;

        public Address() {
            this.number = 137;
            this.street = "Nguyen Thi Thap";
            this.city = "Da Nang";
            this.numberPrivate = 137;
            this.numberProtected = 137;
            this.print();
        }
        
        public void print() {
           System.out.println("Class Address [number: "+ number + ", street: " + street + ", city: " + city + "]");
        }
    }
    public class Contact {
        public String phoneNumber;
        public String mail;
        public String name;
        private String namePrivate;
        protected String nameProtected;
        
        public Contact() {
            this.phoneNumber = "0123456789";
            this.mail = "hadpde130124@fpt.edu.vn";
            this.name = "Ha";
            this.namePrivate = "Ha";
            this.nameProtected = "Ha";
            this.print();
        }
        
        
        public void print() {
           System.out.println("Class Contact [phoneNumber: "+ phoneNumber + ", mail: " + mail + ", name: " + name + "]");
        }
    }

    public static void main(String[] args) {
        Customer o=new Customer();
        Customer.Address i=o.new Address();
        Customer.Contact h=o.new Contact();
    }
    
}
