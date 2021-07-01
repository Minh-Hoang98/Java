package model;
public class ProductLine extends Product{
   public int quantity=1;
    
    public ProductLine() {
        super();
    }
    
    public ProductLine(int quantity) {
        this.quantity = quantity;
    }

    public ProductLine(int quantity, int ProductID, String ProductName, int Price) {
        super(ProductID, ProductName, Price);
        this.quantity = quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }  
  
}
    
