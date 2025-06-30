<html>
<head>
    <title>Restock Inventory</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body class="dashboard">
    <div class="container">
        <h1><i class="fas fa-sync"></i> Restock Inventory</h1>
        <form action="RestockServlet" method="post">
            <label>Product ID:</label>
            <input type="number" name="productId" required>

            <label>Quantity to Add:</label>
            <input type="number" name="quantity" required>

            <input type="submit" value="Restock">
        </form>
    </div>
</body>
</html>
