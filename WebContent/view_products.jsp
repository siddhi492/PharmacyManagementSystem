<%@ page import="java.util.*, com.pharmacy.dao.ProductDAO, com.pharmacy.model.Product" %>
<html>
<head>
    <title>Product List</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body class="dashboard">
    <div class="container">
        <h1><i class="fas fa-boxes"></i> Product List</h1>
        <table>
            <tr><th>ID</th><th>Name</th><th>Price</th><th>Quantity</th></tr>
            <% List<Product> list = ProductDAO.getAllProducts(); for (Product p : list) { %>
            <tr>
                <td><%= p.getId() %></td>
                <td><%= p.getName() %></td>
                <td>Rs. <%= p.getPrice() %></td>
                <td><%= p.getQuantity() %></td>
            </tr>
            <% } %>
        </table>
    </div>
</body>
</html>