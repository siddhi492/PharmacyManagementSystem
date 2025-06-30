<%@ page import="com.pharmacy.model.User" %>
<%
    User user = (User) session.getAttribute("user");
    if (user == null || !"customer".equals(user.getRole())) {
        response.sendRedirect("login.html");
    }
%>
<html>
<head>
    <title>Customer Dashboard</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body class="dashboard">
    <div class="container">
        <h1><i class="fas fa-user"></i> Welcome, <%= user.getUsername() %></h1>
        <div class="card-grid">
            <a href="buy.jsp" class="card">
                <i class="fas fa-pills"></i>
                <span>Buy Medicine</span>
            </a>
            <a href="view_orders.jsp" class="card">
                <i class="fas fa-clipboard-list"></i>
                <span>View Orders</span>
            </a>
        </div>
    </div>
</body>
</html>
