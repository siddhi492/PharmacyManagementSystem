package com.pharmacy.model;

public class Order {
    private int id;
    private int productId;
    private int userId;
    private int quantity;
    private double total;

    public Order(int id, int productId, int userId, int quantity, double total) {
        this.id = id;
        this.productId = productId;
        this.userId = userId;
        this.quantity = quantity;
        this.total = total;
    }

    // Getters
    public int getId() { return id; }
    public int getProductId() { return productId; }
    public int getUserId() { return userId; }
    public int getQuantity() { return quantity; }
    public double getTotal() { return total; }

    // Setters (optional)
    public void setId(int id) { this.id = id; }
    public void setProductId(int productId) { this.productId = productId; }
    public void setUserId(int userId) { this.userId = userId; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setTotal(double total) { this.total = total; }
}
