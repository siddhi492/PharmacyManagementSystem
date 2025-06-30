package com.pharmacy.controller;

import com.pharmacy.dao.OrderDAO;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;

public class BuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("productId"));
        int userId = Integer.parseInt(request.getParameter("userId"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double total = Double.parseDouble(request.getParameter("total"));

        OrderDAO.createOrder(productId, userId, quantity, total);
        response.sendRedirect("view_orders.jsp");
    }
}
