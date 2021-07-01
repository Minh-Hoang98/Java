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
public class Supplier {
    private String supCode = "";
    private String supName = "";
    private String address = "";
    private boolean colloborating = true;
    
    public Supplier() {
        
    }
    
    public Supplier(String supCode, String supName, String address, boolean colloborating) {
        setSupCode(supCode);
        setSupName(supName);
        setAddress(address);
        setColloborating(colloborating);
    }
    
    @Override
    public String toString() {
        return supCode + "-" + supName;
    }

    /**
     * @return the supCode
     */
    public String getSupCode() {
        return supCode;
    }

    /**
     * @param supCode the supCode to set
     */
    public void setSupCode(String supCode) {
        this.supCode = supCode;
    }

    /**
     * @return the supName
     */
    public String getSupName() {
        return supName;
    }

    /**
     * @param supName the supName to set
     */
    public void setSupName(String supName) {
        this.supName = supName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the colloborating
     */
    public boolean isColloborating() {
        return colloborating;
    }

    /**
     * @param colloborating the colloborating to set
     */
    public void setColloborating(boolean colloborating) {
        this.colloborating = colloborating;
    }
}
