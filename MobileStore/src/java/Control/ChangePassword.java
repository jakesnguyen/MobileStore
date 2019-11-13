/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jakes
 */
public class ChangePassword extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ChangePassword</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ChangePassword at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String userName = request.getParameter("userName");
        String oldPassword = request.getParameter("oldPassword");
        String newPassword = request.getParameter("newPassword");
        String confirmNewPassword = request.getParameter("confirmNewPassword");

        UserDAO udao = new UserDAO();

        String old = (udao.getOldpassword(userName));

        if (!old.equals(oldPassword)) {
            String mess = "Old password is wrong!!";
            request.setAttribute("MESS2", mess);
            request.getRequestDispatcher("userInfo.jsp").forward(request, response);
        }
        if (oldPassword.equals(newPassword)) {
            String mess = "New Password must be change";
            request.setAttribute("MESS2", mess);
            request.getRequestDispatcher("userInfo.jsp").forward(request, response);
        }
        if (!newPassword.equals(confirmNewPassword)) {
            String mess = "New password and confirm new password must be same!";
            request.setAttribute("MESS2", mess);
            request.getRequestDispatcher("userInfo.jsp").forward(request, response);
        }
        if (newPassword.length() < 7) {
            String mess = "Password must greater 6 characters";
            request.setAttribute("MESS2", mess);
            request.getRequestDispatcher("userInfo.jsp").forward(request, response);
        }
        if (old.equals(oldPassword) && newPassword.length() > 5) {
            if (newPassword.equals(confirmNewPassword)) {

                udao.changePassword(newPassword, userName);

                String mess = "Change password success!";
                request.setAttribute("MESS2", mess);
                request.getRequestDispatcher("userInfo.jsp").forward(request, response);
            }
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
