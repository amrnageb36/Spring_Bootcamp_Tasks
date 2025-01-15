package com.adminPanel.app.dao;

import com.adminPanel.app.model.Product;
import com.adminPanel.app.model.ProductDetails;

import java.util.List;

public interface ProductDao {

    Product insert(ProductDetails product);
    Product findById(int id);
    Product deleteById(int id);
    Product update(Product product);
    List<Product> getAllProducts();

}
