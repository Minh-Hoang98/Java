package control;

import control.DBUtils;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import static model.DatabaseInfo.dbURL;
import static model.DatabaseInfo.driverName;
import static model.DatabaseInfo.passDB;
import static model.DatabaseInfo.userDB;
import model.Tbl_AccountDTO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Laptop88
 */
public class Tbl_AccountDAO implements Serializable {

    public Tbl_AccountDTO checkLogin(String username, String password) throws SQLException, ClassNotFoundException {       
        PreparedStatement stm = null;
        ResultSet rs = null;
        Tbl_AccountDTO user = null;

        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            if (con != null) {
                
                stm = con.prepareStatement("SELECT * FROM Account where username =? AND password =? AND role = 1");
                stm.setString(1, username);
                stm.setString(2, password);

                rs = stm.executeQuery();
                if (rs.next()) {
                    String fullName = rs.getString(3);
                    user = new Tbl_AccountDTO(username, "", fullName, 1);
                }
            }
            con.close();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }           
        }
        return user;
    }
}
