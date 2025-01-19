package com.adminPanel.app.dao;

import com.adminPanel.app.model.Product;
import com.adminPanel.app.model.ProductDetails;

import java.util.List;

public interface ProductDao {

    ProductDetails insert(ProductDetails product);
    Product findById(int id);
    void deleteById(int id);
    void update(ProductDetails product);
    List<Product> getAllProducts();

}
