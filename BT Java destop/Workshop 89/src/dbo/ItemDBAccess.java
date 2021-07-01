/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbo;

/**
 *
 * @author huynhducduy
 */
public class ItemDBAccess extends DBAccess {
    final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    final String url =  "jdbc:sqlserver://127.0.0.1\\SQLEXPRESS:1433;" +
                        "databasename=ItemDB;user=sa;password=123456";
    public ItemDBAccess() {
        super();
        connectDB(driver, url);
    }
}
