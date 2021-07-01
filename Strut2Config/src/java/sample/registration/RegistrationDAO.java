/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.registration;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import sample.utils.DBUtilities;

public class RegistrationDAO implements Serializable {
    public boolean checkLogin(String username, String password)
        throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        // 1.ket noi DB
        try {
            con = DBUtilities.makeConnection();
            if (con != null) {
                //2.tao sql statement
                String sql = "Select * From Registration Where username = ? And password = ?";
                //3 tao statement
                ps = con.prepareStatement(sql);
                ps.setString(1, username);
                ps.setString(2, password);
                
                //4 thuc thi cau lenh
                rs = ps.executeQuery();
                
                //5 lay du lieu
                if (rs.next()) {
                    return true;
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
    
    private List<RegistrationDTO> listAccounts;

    public List<RegistrationDTO> getListAccounts() {
        return listAccounts;
    }
    
    public void searchLastname(String searchValue) 
            throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        // 1.ket noi DB
        try {
            con = DBUtilities.makeConnection();
            if (con != null) {
                //2.tao sql statement
                String sql = "Select * From Registration Where lastname LIKE ?";
                //3 tao statement
                ps = con.prepareStatement(sql);
                ps.setString(1,"%" + searchValue + "%");
                //4 thuc thi cau lenh
                rs = ps.executeQuery();
                
                //5 lay du lieu
             while(rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String lastname = rs.getString("lastname");
                boolean role = rs.getBoolean("isAdmin");
                
                RegistrationDTO dto = new RegistrationDTO(username, password, lastname, role);
                if (this.listAccounts == null) {
                    this.listAccounts = new ArrayList<>();
                }
                this.listAccounts.add(dto);
             }   
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
    
    public String getLastname(String username)
        throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String lastname = "";
        try {
            con = DBUtilities.makeConnection();
            if (con != null) {
                String sql = "SELECT lastname FROM Registration WHERE username = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, username);
                rs = ps.executeQuery();
                if (rs.next()) {
                    lastname = rs.getString("lastname");
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return lastname;
    }
    
    public boolean deleteAccount(String username)
        throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = DBUtilities.makeConnection();
            
            if (con != null) {
                String sql = "DELETE FROM Registration WHERE username = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, username);
                
                int row = ps.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
    
    public boolean updateAccount(String username, String password, boolean role)
        throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = DBUtilities.makeConnection();
            
            if (con != null) {
                String sql = "UPDATE Registration SET password = ?, isAdmin = ? WHERE username = ? ";
                ps = con.prepareStatement(sql);
                ps.setString(1, password);
                ps.setBoolean(2, role);
                ps.setString(3, username);
                
                int row = ps.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
    
    public boolean createAccount (String username, String password, boolean role, String fullname) 
            throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        // 1.ket noi DB
        try {
            con = DBUtilities.makeConnection();
            if (con != null) {
                //2.tao sql statement
                String sql = "INSERT INTO Registration (username, password, isAdmin, lastname) values(?,?,?,?)";
                //3 tao statement
                ps = con.prepareStatement(sql);
                ps.setString(1, username);
                ps.setString(2, password);
                ps.setBoolean(3, role);
                ps.setString(4, fullname);
                int row = ps.executeUpdate();
                if (row > 0) {
                    return true;
                }
             
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
}
