package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.DatabaseInfo.dbURL;
import static model.DatabaseInfo.driverName;
import static model.DatabaseInfo.passDB;
import static model.DatabaseInfo.userDB;

public class BookDB {

    //--------------------------------------------------------------------

    public static Book getBook(String bid) {
        Book b = null;
        Connection con = null;
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select bookID, title, author, category, keyword from Books where bookID='" + bid + "'");
            if (rs.next()) {
                String bookID = rs.getString(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                String category = rs.getString(4);
                String keyword = rs.getString(5);
                String userID = bid;
                b = new Book(bookID, title, author, category, keyword);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return b;
    }

    //--------------------------------------------------------------------   

    public static Vector<Vector> searchByCategory(String cat) {
        Vector<Category> books = new Vector<>();
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Select BookID, Book Title, Author, Keyword");
            stmt.setString(1, cat);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Vector b = new Vector<>();
                b.add(rs.getString(1));
                b.add(rs.getString(2));
                b.add(rs.getString(3));
                b.add(rs.getString(4));
                books.add(new Category());
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BookDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    //--------------------------------------------------------------------   

    public static Vector getColumnsName() {
        Vector tb = new Vector();
        tb.add("BookID");
        tb.add("Title");
        tb.add("Author");
        tb.add("Keyword");
        return tb;
    }

    //-------------------------------------------------------------------- 
    
    public static ArrayList<Book> searchByKeyword(String key) {
        return null;
    }

    //--------------------------------------------------------------------   

    public static boolean addNewBook(Book b) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Insert into Book Values bookID=?, title=?, author=?, category=?, keyword=?");
            stmt.setString(1, b.getBookID());
            stmt.setString(2, b.getTitle());
            stmt.setString(3, b.getAuthor());
            stmt.setString(4, b.getCategory());
            stmt.setString(5, b.getKeyword());
            int rc = stmt.executeUpdate();
            con.close();
            return rc == 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //--------------------------------------------------------------------   

    public static Vector<Vector> searchByTitle(String title) {
        return null;
    }

    //--------------------------------------------------------------------

    public static Vector<Category> getCats() {
        Vector<Category> v = new Vector<>();
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Select catID, catName");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String cid = rs.getString(1);
                String cName = rs.getString(2);
                v.add(new Category(cName, cid));
            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(BookDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }

 //--------------------------------------------------------------------   
}
