package com.adminPanel.app.dao;

import com.adminPanel.app.model.Product;
import com.adminPanel.app.model.ProductDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao{



    @Autowired
    private SessionFactory sessionFactory;



    @Override
    public Product insert(ProductDetails product) {
        return null;
    }

    @Override
    @Transactional
    public Product findById(int id) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Product.class, id);
    }

    @Override
    public Product deleteById(int id) {
        return null;
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
       // List fromProduct = sessionFactory.getCurrentSession().createQuery("from product").list();
        return null;
    }
}
