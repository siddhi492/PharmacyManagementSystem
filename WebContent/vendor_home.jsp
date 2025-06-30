<%@ page import="com.pharmacy.model.User" %>
<%
    User user = (User) session.getAttribute("user");
    if (user == null || !"vendor".equals(user.getRole())) {
        response.sendRedirect("login.html");
    }
%>
<html>
<head>
  <title>Vendor Dashboard</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
</head>
<body class="dashboard">
  <div class="container">
    <h1><i class="fas fa-store"></i> Welcome, <%= user.getUsername() %></h1>
    <div class="card-grid">
      <a href="add_product.jsp" class="card">
        <i class="fas fa-plus-circle"></i>
        <span>Add Product</span>
      </a>
      <a href="view_products.jsp" class="card">
        <i class="fas fa-boxes"></i>
        <span>View Products</span>
      </a>
      <a href="restock.jsp" class="card">
        <i class="fas fa-sync-alt"></i>
        <span>Restock</span>
      </a>
      <a href="view_customer_orders.jsp" class="card">
        <i class="fas fa-file-invoice"></i>
        <span>Customer Orders</span>
      </a>
    </div>
  </div>
</body>
</html>
