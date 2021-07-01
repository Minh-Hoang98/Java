package control;

import control.DBUtils;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
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

    public Tbl_AccountDTO checkLogin(String username, String password) throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Tbl_AccountDTO user = null;

        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "SELECT * FROM tbl_Account"
                        + "WHERE username = ? AND password = ? AND role = 1";

                stm = con.prepareStatement(sql);
                stm.setString(1, username);
                stm.setString(2, password);

                rs = stm.executeQuery();
                if (rs.next()) {
                    String fullName = rs.getString(3);

                    user = new Tbl_AccountDTO(username, "", fullName, 1);
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
        return user;
    }
}
