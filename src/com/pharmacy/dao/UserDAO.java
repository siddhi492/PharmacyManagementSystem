package com.pharmacy.dao;

import com.pharmacy.model.User;
import java.sql.*;

public class UserDAO {
    public static void registerUser(User user) {
        try (Connection con = DBConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement("INSERT INTO users(username, password, role) VALUES (?, ?, ?)");
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getRole());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static User validateUser(String username, String password, String role) {
        try (Connection con = DBConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE username=? AND password=? AND role=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, role);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new User(username, password, role);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
