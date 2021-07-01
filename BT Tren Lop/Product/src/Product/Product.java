
package Product;

import java.io.Serializable;
import model.DatabaseInfo;
import model.ProductDB;

public class Product implements DatabaseInfo, Serializable{
    public String id;
    public String name;
    public String unit;
    public float price;

    public Product() {
    }

    public Product(String sc) {
        Product s = ProductDB.getProduct(sc);
        this.id = s.id;
        this.name = s.name;
        this.unit = s.unit;
        this.price = s.price;
    }
    
    public Product(String id, String name, String unit, float price) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.price = price;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
}
