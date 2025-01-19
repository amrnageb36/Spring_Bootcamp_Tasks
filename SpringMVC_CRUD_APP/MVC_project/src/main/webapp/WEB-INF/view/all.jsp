<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Management</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/all.css">

</head>
<body>
    <div class="container">
        <div class="page-header d-flex justify-content-between align-items-center">
            <div>
                <h1 class="mb-0"><i class="fas fa-boxes me-2"></i>Product Management</h1>
                <p class="mb-0 mt-2">Manage your products efficiently</p>
            </div>
            <c:url var="addPage" value="/AddPage"></c:url>
            <a href="${addPage}" class="btn btn-add-product">
                <i class="fas fa-plus me-2"></i>Add New Product
            </a>
        </div>

        <div class="table-container">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th><i class="fas fa-hashtag me-2"></i>ID</th>
                        <th><i class="fas fa-tag me-2"></i>Name</th>
                        <th><i class="fas fa-cogs me-2"></i>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${products}" var="product">
                        <tr>
                            <td>${product.id}</td>
                            <td>${product.name}</td>
                            <td class="action-buttons">
                                <c:url var="showDetails" value="/showProductDetails">
                                    <c:param name="productId" value="${product.id}" />
                                </c:url>
                                <a href="${showDetails}" class="btn btn-view">
                                    <i class="fas fa-eye me-1"></i>View
                                </a>

                                <c:url var="updateDetails" value="/updatePage">
                                    <c:param name="productId" value="${product.id}" />
                                </c:url>
                                <a href="${updateDetails}" class="btn btn-update">
                                    <i class="fas fa-edit me-1"></i>Update
                                </a>

                                <c:url var="deleteProduct" value="/delete">
                                    <c:param name="productId" value="${product.id}" />
                                </c:url>
                                <a href="${deleteProduct}" class="btn btn-delete"
                                   onclick="return confirm('Are you sure you want to delete this product?');">
                                    <i class="fas fa-trash-alt me-1"></i>Delete
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <div class="footer">
            <p class="text-muted mb-0">
                <i class="fas fa-code me-2"></i>Product Management System &copy; 2025
            </p>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>