/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.DatabaseInfo.*;


public class StartVote implements DatabaseInfo, Serializable{
    private int startId;
    private String startName;
    private int numOfVote;

    public StartVote() {
    }

    public StartVote(int startId, String startName, int numOfVote) {
        this.startId = startId;
        this.startName = startName;
        this.numOfVote = numOfVote;
    }

    public int getStartId() {
        return startId;
    }

    public void setStartId(int startId) {
        this.startId = startId;
    }

    public String getStartName() {
        return startName;
    }

    public void setStartName(String startName) {
        this.startName = startName;
    }

    public int getNumOfVote() {
        return numOfVote;
    }

    public void setNumOfVote(int numOfVote) {
        this.numOfVote = numOfVote;
    }
    
    public ArrayList<StartVote> getall() {
        ArrayList<StartVote> list = new ArrayList<>();
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Select starId, starName, numOfVote from StarVote");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int number = rs.getInt(3);
                StartVote st = new StartVote(id, name, number);
                list.add(st);
            }   
            rs.close();
            stmt.close();
            con.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(StartVote.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StartVote.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static int update(String id){           
        try{
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Update StarVote set numOfVote= numOfVote+1 where starId=?");
            stmt.setString(1, id);;
            int rc = stmt.executeUpdate();
            con.close();  
            return rc;
        } catch (Exception ex) {
            Logger.getLogger(StartVote.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return 0;
    }
    
    public static void main(String[] args) {     
    }
}
