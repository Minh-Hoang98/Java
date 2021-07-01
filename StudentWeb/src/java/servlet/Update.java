/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import model.Student;
import model.StudentDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Laptop88
 */
@WebServlet(name = "Update", urlPatterns = {"/Update"})
public class Update extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Gender = null;
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String gender = request.getParameter("gender");
            if (gender.equals("1")) {
                Gender = "1";
            } else if (gender.equals("0")) {
                Gender = "0";
            }
            String dob = request.getParameter("dob");            
            boolean b =  StudentDB.updateStudent(id, name, Gender, dob);
            JFrame frame = new JFrame("");
            if (b == false) {
                //msg = "Add Student Failed!!!";
                JOptionPane.showMessageDialog(frame, "Failed!!!");
                request.getRequestDispatcher("updateStudent.jsp").forward(request, response);
            }
            else{
                JOptionPane.showMessageDialog(frame, "Success!!!");
                response.sendRedirect("listStudent");
            }                 
}
}
