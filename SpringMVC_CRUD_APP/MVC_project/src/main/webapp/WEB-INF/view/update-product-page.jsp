<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/form.css">

</head>
<body>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <div class="card animate__animated animate__fadeIn">
                    <h2 class="form-title">Add New Product</h2>
                    <form:form action="updateProduct" method="post" modelAttribute="productDetails" >
                        <form:hidden  path="product.id" value="${productId}"/>
                        <div class="form-group">
                            <label class="form-label" for="name">Product Name</label>
                            <div class="input-icon">
                                <form:input class="form-control" path="name" placeholder="Enter product name"/>
                                <i class="fas fa-box"></i>
                            </div>
                            <form:errors path="name" class="error"/>
                        </div>

                        <div class="form-group">
                            <label class="form-label" for="expirationDate">Expiration Date</label>
                            <div class="input-icon">
                                <form:input class="form-control" path="expirationDate" placeholder="dd/mm/yyyy" type="date"/>
                                <i class="fas fa-calendar"></i>
                            </div>
                            <form:errors path="expirationDate" class="error"/>
                        </div>

                        <div class="form-group">
                            <label class="form-label" for="manufacturer">Manufacturer</label>
                            <div class="input-icon">
                                <form:input class="form-control" path="manufacturer" placeholder="Enter manufacturer name"/>
                                <i class="fas fa-industry"></i>
                            </div>
                            <form:errors path="manufacturer" class="error"/>
                        </div>

                        <div class="form-group">
                            <label class="form-label" for="price">Price</label>
                            <div class="input-icon">
                                <form:input class="form-control" path="price" placeholder="Enter price"/>
                                <i class="fas fa-tag"></i>
                            </div>
                            <form:errors path="price" class="error"/>
                        </div>

                        <div class="form-group">
                            <label class="form-label" for="available">Availability</label>
                            <div class="input-icon">
                                <form:select class="form-control" path="available">
                                    <option value="1">Available</option>
                                    <option value="0">Not Available</option>
                                </form:select>
                                <i class="fas fa-check-circle"></i>
                            </div>
                            <form:errors path="available" class="error"/>
                        </div>

                        <button type="submit" class="btn btn-submit">
                            <i class="fas fa-plus-circle me-2"></i>Add Product
                        </button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>