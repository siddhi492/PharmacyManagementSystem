package com.pharmacy.controller;

import com.pharmacy.dao.UserDAO;
import com.pharmacy.model.User;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        User user = UserDAO.validateUser(username, password, role);
        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            if (role.equals("vendor"))
                response.sendRedirect("vendor_home.jsp");
            else
                response.sendRedirect("customer_home.jsp");
        } else {
            response.sendRedirect("login.html");
        }
    }
}