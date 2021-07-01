/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Customer;
import static model.Customer.getCustomer;

public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if ("".equals(request.getParameter("username")) || "".equals(request.getParameter("password"))) {
            response.sendRedirect(request.getContextPath() + "/Login.jsp?msg=errorNull");
            return;
        }
        String uid = request.getParameter("customer");
        String pw = request.getParameter("pw");
        Customer s = new Customer();
        Customer c = getCustomer(uid);

        if (s.checkLogin(uid, pw)) {
            HttpSession session = request.getSession();
            session.setAttribute("id", uid);
            session.setAttribute("cus", c);
            response.sendRedirect("list.jsp");
        } else {
            response.sendRedirect("Login?err=0");
        }
    }
}
