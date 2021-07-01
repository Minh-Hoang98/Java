package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.DatabaseInfo.*;


public class Machine {
    private int machineID;
    private String machineName;
    private String title;
    private String engine;
    private float bucketCapacity;
    private float operatingWeight;
    private String sale;

    public Machine() {
    }

    public Machine(int machineID, String machineName, String title, String engine, float bucketCapacity, float operatingWeight, String sale) {
        this.machineID = machineID;
        this.machineName = machineName;
        this.title = title;
        this.engine = engine;
        this.bucketCapacity = bucketCapacity;
        this.operatingWeight = operatingWeight;
        this.sale = sale;
    }

    public int getMachineID() {
        return machineID;
    }

    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public float getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(float bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public float getOperatingWeight() {
        return operatingWeight;
    }

    public void setOperatingWeight(float operatingWeight) {
        this.operatingWeight = operatingWeight;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }


    public ArrayList<Machine> getAll(){
        ArrayList<Machine> list= new ArrayList<Machine>();
        try {
            Connection con=DriverManager.getConnection(dbURL, userName, password);
            PreparedStatement stmt=con.prepareStatement("Select MachineID,MachineName,Title,Engine,BucketCapacity,OperatingWeight,Sale from Machine");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                machineID=rs.getInt(1);
                machineName=rs.getString(2);
                title=rs.getString(3);
                engine=rs.getString(4);
                bucketCapacity=rs.getFloat(5);
                operatingWeight=rs.getFloat(6);
                sale = rs.getString(7);
                list.add(new Machine(machineID, machineName, title, engine, bucketCapacity, operatingWeight,sale));
            }
            con.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Machine.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static int insertMachine(int machineID, String machineName, String title, String engine, float bucketCapacity, float operatingWeight, String sale) {
        int i = 0;
        try {
            Connection con=DriverManager.getConnection(dbURL, userName, password);
            PreparedStatement ps = con.prepareCall("Insert into Machine values(?,?,?,?,?,?,?)");         
            ps.setInt(1, machineID);
            ps.setString(2, machineName);
            ps.setString(3, title);
            ps.setString(4, engine);
            ps.setFloat(5, bucketCapacity);
            ps.setFloat(7, operatingWeight);
            ps.setString(9, sale);
            i = ps.executeUpdate();
            ps.close();
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return i;
    }
    
    
    @Override
    public String toString() {
        return "Machine{" + "machineID=" + getMachineID()+ ", machineName=" + getMachineName() + ", title=" + getTitle() + ", engine=" + getEngine()  + ", bucketCapacity=" + getBucketCapacity() + ", operatingWeight=" + getOperatingWeight()+ ", Sale=" + getSale() +'}' + "\n";
    }
    
    public static void main(String[] args) {
        Machine a= new Machine();
        System.out.println(a.getAll());
    }
}
