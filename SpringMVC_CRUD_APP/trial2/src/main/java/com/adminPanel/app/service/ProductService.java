/*package com.adminPanel.app.service;

import com.adminPanel.app.dao.ProductDaoImpl;
import com.adminPanel.app.model.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDaoImpl productDAO;

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public Product getProduct(int id) {
        return productDAO.findById(id);
    }
}*/
