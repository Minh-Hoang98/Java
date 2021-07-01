/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import dbo.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author huynhducduy
 */
public class SupplierFullModel extends AbstractTableModel{
    Suppliers suppliers = null;
    
    public SupplierFullModel(Suppliers suppliers){
        this.suppliers=suppliers;
    }
    
    public Suppliers getSuppliers(){
        return suppliers;
    }
    
    @Override
    public int getRowCount() {
        return suppliers.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    public String getColumnName(int column){
        String columnName="";
        switch(column){
            case 0: columnName="Code";break;
            case 1: columnName="Name";break;
            case 2: columnName="Address";break;
            case 3: columnName="Collaborating";break;
        }
        return columnName;
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        Supplier supplier = suppliers.get(row);
        Object obj = null;
        switch(column){
            case 0:obj=supplier.getSupCode();break;
            case 1:obj=supplier.getSupName();break;
            case 2:obj=supplier.getAddress();break;
            case 3:obj=supplier.isColloborating();break;
        }
        return obj;
    }    
}
