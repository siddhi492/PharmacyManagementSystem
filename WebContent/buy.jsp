<%@ page import="com.pharmacy.dao.ProductDAO, com.pharmacy.model.Product" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Buy Medicine</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
    <link rel="stylesheet" href="css/style.css">
    <script>
        function calculateTotal() {
            const price = document.getElementById("product").selectedOptions[0].dataset.price;
            const qty = document.getElementById("quantity").value;
            document.getElementById("total").value = price * qty;
        }
    </script>
</head>
<body class="dashboard">
    <div class="container">
        <h1><i class="fas fa-shopping-cart"></i> Buy Medicine</h1>
        <form action="BuyServlet" method="post">
            <label>Product:</label>
            <select name="productId" id="product" onchange="calculateTotal()">
                <% for (Product p : ProductDAO.getAllProducts()) { %>
                <option value="<%=p.getId()%>" data-price="<%=p.getPrice()%>">
                    <%=p.getName()%> - Rs.<%=p.getPrice()%>
                </option>
                <% } %>
            </select>

            <label>Quantity:</label>
            <input type="number" id="quantity" name="quantity" onchange="calculateTotal()" required>

            <label>User ID:</label>
            <input type="text" name="userId" value="1" readonly>

            <label>Total:</label>
            <input type="text" id="total" name="total" readonly>

            <input type="submit" value="Buy">
        </form>
    </div>
</body>
</html>
