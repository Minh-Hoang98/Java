/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.utils;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author USER
 */
public class DBUtilities implements Serializable {
    
    public static Connection makeConnection() 
        throws NamingException, SQLException {
        Context context = new InitialContext();
        Context tomcatCtx = (Context) context.lookup("java:comp/env");
        DataSource ds = (DataSource) tomcatCtx.lookup("SE1306");
        Connection con = ds.getConnection();
        
        return con;

//        return ((DataSource) ((Context) new InitialContext().lookup("java:comp/env")).lookup("SE1306")).getConnection();
    }
}
