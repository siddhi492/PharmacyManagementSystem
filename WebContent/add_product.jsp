<html>
<head>
    <title>Add Product</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body class="dashboard">
    <div class="container">
        <h1><i class="fas fa-plus-circle"></i> Add New Product</h1>
        <form action="AddProductServlet" method="post">
            <label>Name:</label>
            <input type="text" name="name" required>

            <label>Price:</label>
            <input type="number" step="0.01" name="price" required>

            <label>Quantity:</label>
            <input type="number" name="quantity" required>

            <input type="submit" value="Add Product">
        </form>
    </div>
</body>
</html>