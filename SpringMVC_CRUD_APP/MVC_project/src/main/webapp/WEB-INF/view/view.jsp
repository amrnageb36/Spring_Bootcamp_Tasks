<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Details</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: linear-gradient(135deg, #f8f9fa, #e9ecef);
            font-family: 'Arial', sans-serif;
        }
        .card {
            border: none;
            border-radius: 10px;
        }
        .card-title {
            font-size: 1.5rem;
            margin-bottom: 1rem;
        }
        .card-body {
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        .text-primary {
            color: #007bff !important;
        }
        .row div {
            padding: 0.5rem 0;
        }
        .container {
            max-width: 800px;
        }
    </style>
</head>
<body>
    <div class="container my-5">
        <!-- Page Header -->
        <div class="text-center mb-4">
            <h2 class="fw-bold text-primary">Product Details</h2>
        </div>

        <!-- Product Details Card -->
        <div class="card shadow-sm">
            <div class="card-body">
                <h5 class="card-title text-primary">Product Information</h5>
                <div class="row">
                    <!-- ID -->
                    <div class="col-md-6 mb-3">
                        <strong>ID:</strong> <span>${product.id}</span>
                    </div>
                    <!-- Name -->
                    <div class="col-md-6 mb-3">
                        <strong>Name:</strong> <span>${product.name}</span>
                    </div>
                    <!-- Manufacturer -->
                    <div class="col-md-6 mb-3">
                        <strong>Manufacturer:</strong> <span>${product.productDetails.manufacturer}</span>
                    </div>
                    <!-- Price -->
                    <div class="col-md-6 mb-3">
                        <strong>Price:</strong> <span>${product.productDetails.price}</span>
                    </div>
                    <!-- Availability -->
                    <div class="col-md-6 mb-3">
                        <strong>Available:</strong> <span>${product.productDetails.available}</span>
                    </div>
                    <!-- Expiration Date -->
                    <div class="col-md-6 mb-3">
                        <strong>Expiration Date:</strong> <span>${product.productDetails.expirationDate}</span>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
