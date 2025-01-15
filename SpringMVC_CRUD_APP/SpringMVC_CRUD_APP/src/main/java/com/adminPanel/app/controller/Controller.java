package com.adminPanel.app.controller;


import com.adminPanel.app.dao.ProductDao;
import com.adminPanel.app.dao.ProductDaoImpl;
import com.adminPanel.app.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private ProductDaoImpl productDao;
    @RequestMapping("/find")
    public String findProduct(Model productModel){

    productModel.addAttribute("productModel",productDao.findById(2));

    return "view";
}
}
