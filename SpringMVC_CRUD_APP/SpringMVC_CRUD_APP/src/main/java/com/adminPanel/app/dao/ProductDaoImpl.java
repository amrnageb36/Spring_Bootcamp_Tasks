package com.adminPanel.app.dao;

import com.adminPanel.app.model.Product;
import com.adminPanel.app.model.ProductDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao{

    @Autowired
    Product product;

    @Autowired
    ProductDetails productDetails;

    @Autowired
    SessionFactory sessionFactory;



    @Override
    @Transactional
    public Product insert(ProductDetails product) {
        return null;
    }

    @Override
    @Transactional
    public Product findById(int id) {

        return (Product) sessionFactory.getCurrentSession().get(Product.class,id);
    }

    @Override
    @Transactional
    public Product deleteById(int id) {
        return null;
    }

    @Override
    @Transactional
    public Product update(Product product) {
        return null;
    }

    @Override
    @Transactional
    public List<Product> getAllProducts() {
        List fromProduct = sessionFactory.getCurrentSession().createQuery("from product").list();
        return fromProduct;
    }
}
