/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.mobile;

import java.io.Serializable;

/**
 *
 * @author huynhducduy
 */
public class MobileDTO implements Serializable{
    private String mobileId;
    private String description;
    private String mobileName;
    private int yearOfProduction;
    private int quantity;
    private float price;
    private boolean isNotSale;

    //mới thêm
    public MobileDTO(String mobileId, String mobileName, float price , int quantity) {
        this.mobileId = mobileId;
        this.mobileName = mobileName;
        this.quantity = quantity;
        this.price = price;
    }

    //mới thêm

    public MobileDTO(String mobileId, String mobileName, float price) {
        this.mobileId = mobileId;
        this.mobileName = mobileName;
        this.price = price;
    }
    
    
    public MobileDTO(String mobileId, String description, String mobileName, float price, boolean notSale) {
        this.mobileId = mobileId;
        this.description = description;
        this.mobileName = mobileName;
        this.price = price;
        this.isNotSale = notSale;
    }

    public MobileDTO(String mobileId, String description, String mobileName, int yearOfProduction, int quantity, float price, boolean notSale) {
        this.mobileId = mobileId;
        this.description = description;
        this.mobileName = mobileName;
        this.yearOfProduction = yearOfProduction;
        this.quantity = quantity;
        this.price = price;
        this.isNotSale = notSale;
    }

    public MobileDTO() {
    }

    /**
     * @return the mobileId
     */
    public String getMobileId() {
        return mobileId;
    }

    /**
     * @param mobileId the mobileId to set
     */
    public void setMobileId(String mobileId) {
        this.mobileId = mobileId;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the mobileName
     */
    public String getMobileName() {
        return mobileName;
    }

    /**
     * @param mobileName the mobileName to set
     */
    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    /**
     * @return the yearOfProduction
     */
    public int getYearOfProduction() {
        return yearOfProduction;
    }

    /**
     * @param yearOfProduction the yearOfProduction to set
     */
    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the notSale
     */
    public boolean isNotSale() {
        return isNotSale;
    }

    /**
     * @param notSale the notSale to set
     */
    public void setNotSale(boolean notSale) {
        this.isNotSale = notSale;
    }
}
