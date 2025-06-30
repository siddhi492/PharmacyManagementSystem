package com.pharmacy.dao;

import com.pharmacy.model.Order;
import java.sql.*;
import java.util.*;

public class OrderDAO {
    public static void createOrder(int productId, int userId, int quantity, double total) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO orders (product_id, user_id, quantity, total) VALUES (?, ?, ?, ?)");
            ps.setInt(1, productId);
            ps.setInt(2, userId);
            ps.setInt(3, quantity);
            ps.setDouble(4, total);
            ps.executeUpdate();

            // Decrease product stock
            PreparedStatement update = conn.prepareStatement("UPDATE products SET quantity = quantity - ? WHERE id = ?");
            update.setInt(1, quantity);
            update.setInt(2, productId);
            update.executeUpdate();
        } catch (Exception e) { e.printStackTrace(); }
    }

    public static List<Order> getOrdersByUserId(int userId) {
        List<Order> list = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM orders WHERE user_id = ?");
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(
                    rs.getInt("id"),
                    rs.getInt("product_id"),
                    rs.getInt("user_id"),
                    rs.getInt("quantity"),
                    rs.getDouble("total")
                ));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }
    public static List<Order> getAllOrders() {
        List<Order> orders = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection()) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM orders");
            while (rs.next()) {
                orders.add(new Order(
                    rs.getInt("id"),
                    rs.getInt("product_id"),
                    rs.getInt("user_id"),
                    rs.getInt("quantity"),
                    rs.getDouble("total")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

}
