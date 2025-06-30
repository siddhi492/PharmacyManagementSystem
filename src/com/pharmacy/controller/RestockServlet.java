package com.pharmacy.controller;

import com.pharmacy.dao.ProductDAO;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;

public class RestockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("productId"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        ProductDAO.addStock(productId, quantity);
        response.sendRedirect("vendor_home.jsp");
    }
}
