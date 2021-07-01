package model;

import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import static model.DatabaseInfo.*;

public class Product extends TagSupport {

    private int productID;
    private String productName;
    private int price;

    public Product() {
    }

    public Product(int pid) {
        productID = pid;
    }

    public Product(int productID, String productName, int price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return +productID + "   " + productName + "   " + price;
    }

    public List<Product> getAllProduct() throws ClassNotFoundException, SQLException {
        List<Product> list = new ArrayList<Product>();
        Class.forName(driverName);
        Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("Select * from ProductTBL");
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            int price = rs.getInt(3);
            Product st = new Product(id, name, price);
            System.out.println(st.toString());
            list.add(st);
        }
        stmt.close();
        con.close();
        return list;
    }

    public ArrayList<Product> getAll() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Select * from ProductTBL");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int price = rs.getInt(3);
                Product st = new Product(id, name, price);
                System.out.println(st.toString());
                list.add(st);
            }
            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Product> listsearch;

    public List<Product> getListSearch() {
        return listsearch;
    }

    public void search(String value1, String value2) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(dbURL, userDB, passDB);
            if (con != null) {
                String sql = "select * from ProductTBL where ProductPrice BETWEEN ? AND ? ;";
                stm = con.prepareStatement(sql);
                stm.setString(1, value1);
                stm.setString(2, value2);
                rs = stm.executeQuery();

                while (rs.next()) {
                    int id = rs.getInt("ProductID");
                    String name = rs.getString("ProductName");
                    int price = rs.getInt("ProductPrice");

                    Product dto = new Product(id, name, price);
                    if (listsearch == null) {
                        listsearch = new ArrayList<>();
                    }
                    listsearch.add(dto);
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

    public Product getProduct(int productID) {
        Product st = null;
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select ProductID,ProductName,ProductPrice from ProductTBL where ProductID=" + productID + "");
            if (rs.next()) {
                int pid = rs.getInt("ProductID");
                String pname = rs.getString("ProductName");
                int price = rs.getInt("ProductPrice");

                st = new Product(pid, pname, price);
            }
            con.close();

        } catch (Exception ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return st;
    }

    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();   
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from ProductTBL");

            out.write("<table border='1'>");
            out.write("<tr>");
            out.println("<td>STT</td><td>Tên Sản Phẩm</td><td>Giá</td>");
            out.println("</tr>");
            while (rs.next()) {
                out.write("<th>" + rs.getInt(1) + "</th>");
                out.print("<th>" + rs.getString(2) + "</th>");
                out.print("<th>" + rs.getInt(3) + "</th>");
                out.write("</tr>");
            }

            out.write("</table>");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return SKIP_BODY;
    }

    public int doEndTag() throws JspException {
        return EVAL_PAGE;
    }
}
