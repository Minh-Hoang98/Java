package lab3;

import java.sql.*;
import javax.sql.*;


public class Data {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        System.out.println("Ket noi CSDL");
        
        try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://Mr_Css:1433;databaseName=DATA;";
            Connection con = DriverManager.getConnection(url, "se1305", "abcd");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from Table1");
            ResultSetMetaData rsmd = rs.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            for (int j = 1; j <= numberOfColumns; j++) {
                System.out.print(rsmd.getColumnLabel(j));
                System.out.print("         ");
            }
            while (rs.next()) {
                System.out.println(" ");
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.print(rs.getObject(i));
                    System.out.print("         ");
                }
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
