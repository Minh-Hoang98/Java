/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import model.Product;
import model.ProductDB;

public class ListProductAction extends ActionSupport{

    private List<Product> list;
    private final String SUCCESS = "success";
    private final String FAIL = "fail";

    public String execute() throws Exception {     
        ProductDB a = new ProductDB();
        list = (ArrayList) a.getList();
        return SUCCESS;
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public static void main(String[] args) throws Exception {
        ListProductAction a = new ListProductAction();
        System.out.println(a.execute());
    }

}
