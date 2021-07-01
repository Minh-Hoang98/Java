
package model;

public class Category {
    private String catName;
    private String catId;

    public Category() {
    }

    public Category(String catName, String catId) {
        this.catName = catName;
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

   
    public String toString() {
        return catName + "-" + catId;
    }
    
    
}
