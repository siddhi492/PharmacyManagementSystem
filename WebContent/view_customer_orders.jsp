<%@ page import="java.util.*, com.pharmacy.dao.OrderDAO, com.pharmacy.model.Order" %>
<html>
<head>
    <title>Customer Orders</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body class="dashboard">
    <div class="container">
        <h1><i class="fas fa-file-invoice-dollar"></i> All Customer Orders</h1>
        <table>
            <tr><th>Order ID</th><th>User ID</th><th>Product ID</th><th>Qty</th><th>Total</th></tr>
            <% List<Order> orders = OrderDAO.getAllOrders(); for (Order o : orders) { %>
            <tr>
                <td><%= o.getId() %></td>
                <td><%= o.getUserId() %></td>
                <td><%= o.getProductId() %></td>
                <td><%= o.getQuantity() %></td>
                <td>Rs. <%= o.getTotal() %></td>
            </tr>
            <% } %>
        </table>
    </div>
</body>
</html>
