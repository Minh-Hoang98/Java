/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbo;

/**
 *
 * @author huynhducduy
 */
public class Item {
    private String itemCode = "";
    private String itemName = "";
    private String unit = "";
    private Supplier supplier = null;
    private int price = 0;
    private boolean supplying = false;
    
    public Item() {
        
    }
    
    public Item(String itemCode, String itemName, Supplier supplier, String unit, int price, boolean supplying) {
        setItemCode(itemCode);
        setItemName(itemName);
        setSupplier(supplier);
        setUnit(unit);
        setPrice(price);
        setSupplying(supplying);
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return the supplier
     */
    public Supplier getSupplier() {
        return supplier;
    }

    /**
     * @param supplier the supplier to set
     */
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the supplying
     */
    public boolean isSupplying() {
        return supplying;
    }

    /**
     * @param supplying the supplying to set
     */
    public void setSupplying(boolean supplying) {
        this.supplying = supplying;
    }
}
