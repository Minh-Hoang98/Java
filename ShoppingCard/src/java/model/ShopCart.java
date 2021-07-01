package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import static model.DatabaseInfo.dbURL;
import static model.DatabaseInfo.*;

public class ShopCart {

    public static ArrayList<ProductLine> cardL = new ArrayList<>();
    public static ArrayList<Product> listProduct = Product.list();

    public ShopCart() {
    }

    public static boolean checkProduct(int a) {
        for (int i = 0; i < cardL.size(); i++) {
            if (cardL.get(i).getProductID() == a) {
                return true;
            }
        }
        return false;
    }

    public static void addProduct(int a) {
        boolean check = checkProduct(a);
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getProductID() == a && check == false) {
                cardL.add(new ProductLine(1, listProduct.get(i).getProductID(), listProduct.get(i).getProductName(), listProduct.get(i).getPrice()));
            }
        }
        if (check == true) {
            int j = cardL.size();
            for (int i = 0; i < j; i++) {
                if (cardL.get(i).getProductID() == a) {
                    cardL.get(i).setQuantity(cardL.get(i).getQuantity() + 1);
                    j = i;
                }
            }
        }
    }

    public static void deleteProduct(int a) {
        for (int i = 0; i < cardL.size(); i++) {
            if (cardL.get(i).getProductID() == a) {
                cardL.remove(i);
            }
        }

    }
    public static void main(String[] args) {
        checkProduct(2);
    }
}
