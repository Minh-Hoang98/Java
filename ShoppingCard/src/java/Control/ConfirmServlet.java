package Control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Customer;
import model.Manager;
import model.ProductLine;
import model.ShopCart;

public class ConfirmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Manager manager = new Manager();
        HttpSession session = request.getSession();
        String pay = request.getParameter("Select");
        Customer cus = (Customer) session.getAttribute("cus");
        manager.addOrder(cus.getcID(),pay);
        ArrayList<ProductLine> card = new ShopCart().cardL;

        for (ProductLine b : card) {
            manager.addOrderLine(manager.getOrderid(), b.getProductID(), b.getQuantity(), b.getPrice() * b.getQuantity());
        }
        ShopCart.cardL.clear();
        response.sendRedirect("list.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
