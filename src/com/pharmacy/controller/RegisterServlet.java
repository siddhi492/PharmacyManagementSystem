package com.pharmacy.controller;

import com.pharmacy.dao.UserDAO;
import com.pharmacy.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        User user = new User(username, password, role);
        UserDAO.registerUser(user);
        response.sendRedirect("login.html");
    }
}
