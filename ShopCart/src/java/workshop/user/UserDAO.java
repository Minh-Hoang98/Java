/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.user;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import sample.DBAccess.DBAccess;

/**
 *
 * @author huynhducduy
 */
public class UserDAO implements Serializable{
    public String checklogin(String user, String password) throws NamingException, SQLException{
            Connection con  = null;
            PreparedStatement stm =null;
            ResultSet rs =null;
            try {
            con= DBAccess.getmyConnection();
            if(con!=null){
                String sql = "select * from Account where username = ? and password = ?";

                stm = con.prepareStatement(sql);
                stm.setString(1, user);
                stm.setString(2, password);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                   int result = rs.getInt("role");
                   if (result==1){
                       return "staff";
                   } else if(result==0){
                       return "user";
                   }
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return "invalid";
    }
    public String getfullname(String user) throws NamingException, SQLException{
            Connection con  = null;
            PreparedStatement stm =null;
            ResultSet rs =null;
            try {
            con= DBAccess.getmyConnection();
            if(con!=null){
                String sql = "select * from Account where username = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, user);
                rs = stm.executeQuery();
                if(rs.next()){
                   return rs.getString("fullName");
            
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
}
