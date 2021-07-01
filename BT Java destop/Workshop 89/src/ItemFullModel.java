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
public class ItemFullModel extends AbstractTableModel {
    Items items = null;
    public ItemFullModel(Items items) {
        this.items = items;
    }
    
    public Items getItems() {
        return items;
    }
    
    public int getRowCount() {
        return items.size();
    }
    
    public int getColumnCount() {
        return 6;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Code";
            case 1: return "Name";
            case 2: return "Supplier";
            case 3: return "Unit";
            case 4: return "Price";
            case 5: return "Supply";
        }
        return "";
    }

    @Override
    public Object getValueAt(int row, int col) {
        Item item = items.get(row);
        Object obj = null;
        switch (col) {
            case 0: return item.getItemCode();
            case 1: return item.getItemName();
            case 2: return item.getSupplier().getSupCode();
            case 3: return item.getUnit();
            case 4: return item.getPrice();
            case 5: return item.isSupplying();
        }
        return null;
    }
}
