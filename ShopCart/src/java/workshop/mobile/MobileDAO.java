/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.mobile;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import sample.DBAccess.DBAccess;

/**
 *
 * @author huynhducduy
 */
public class MobileDAO implements Serializable {

    public List<MobileDTO> listmobistaff;

    public List<MobileDTO> getListmobistaff() {
        return listmobistaff;
    }

    public void staffsearch(String searchvalue) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBAccess.getmyConnection();
            if (con != null) {
                String sql = "select * from Mobile where mobileID like ? or mobileName like ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + searchvalue + "%");
                stm.setString(2, "%" + searchvalue + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    String id = rs.getString("mobileID");
                    //String des = rs.getString("description");
                    String name = rs.getString("mobileName");
                    float price = rs.getFloat("price");
                    //int year = rs.getInt("yearOfProduction");
                    int quantity = rs.getInt("quantity");
                    //boolean notsale = rs.getBoolean("notSale");
                    //MobileDTO dto = new MobileDTO(id, des, name, year, quantity, price, notsale);
                    MobileDTO dto = new MobileDTO(id, name, price, quantity);
                    if (listmobistaff == null) {
                        listmobistaff = new ArrayList<>();
                    }
                    listmobistaff.add(dto);

                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
    public List<MobileDTO> listmobiuser;

    public List<MobileDTO> getListmobiuser() {
        return listmobiuser;
    }

    public void usersearch(String value1, String value2) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBAccess.getmyConnection();
            if (con != null) {
                String sql = "select * from Mobile where price BETWEEN ? AND ? ;";
                stm = con.prepareStatement(sql);
                stm.setString(1, value1);
                stm.setString(2, value2);
                rs = stm.executeQuery();

                while (rs.next()) {
                    String id = rs.getString("mobileId");
                    //String des = rs.getString("description");
                    float price = rs.getFloat("price");
                    String name = rs.getString("mobileName");
                   // boolean notsale = rs.getBoolean("notSale");

                    //MobileDTO dto = new MobileDTO(id, des, name, price, notsale);
                    MobileDTO dto = new MobileDTO(id, name, price);
                    if (listmobiuser == null) {
                        listmobiuser = new ArrayList<>();
                    }
                    listmobiuser.add(dto);

                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public boolean update(String price, String quantity, String des, boolean onsale, String mobileId) throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBAccess.getmyConnection();
            if (con != null) {
                String sql = "Update tbl_Mobile set price= ? , quantity=? , description = ?, notSale =? where mobileId = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, price);
                stm.setString(2, quantity);
                stm.setString(3, des);
                stm.setBoolean(4, onsale);
                stm.setString(5, mobileId);
                int result = stm.executeUpdate();
                if (result > 0) {
                    return true;
                }
            }
        } finally {

            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return false;
    }

    public boolean Delete(String mobileId) throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;

        try {
            con = DBAccess.getmyConnection();
            if (con != null) {
                //create sql statement
                String sql = "Delete from tbl_Mobile where mobileId =?";
                stm = con.prepareStatement(sql);
                stm.setString(1, mobileId);
                int result = stm.executeUpdate();
                if (result > 0) {
                    return true;
                }
            }
        } finally {

            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;

    }

    public boolean CreateNewMobile(String mobileid, String mobilename, String des, String price, String year, String quantity, boolean issale) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;

        try {
            con = DBAccess.getmyConnection();
            if (con != null) {
                //create sql statement
                String sql = "Insert into tbl_Mobile(mobileId, description, price, mobileName,yearOfProduction,quantity,notSale) values(?, ?, ?, ?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, mobileid);
                stm.setString(2, des);
                stm.setString(3, price);
                stm.setString(4, mobilename);
                stm.setString(5, year);
                stm.setString(6, quantity);
                stm.setBoolean(7, issale);
                int result = stm.executeUpdate();
                if (result > 0) {
                    return true;
                }
            }
        } finally {

            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
}
