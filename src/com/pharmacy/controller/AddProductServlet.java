package com.pharmacy.controller;

import com.pharmacy.dao.ProductDAO;
import com.pharmacy.model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;


import java.io.IOException;

public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        Product product = new Product(name, price, quantity);
        ProductDAO.addProduct(product);

        response.sendRedirect("vendor_home.jsp");
    }
}
