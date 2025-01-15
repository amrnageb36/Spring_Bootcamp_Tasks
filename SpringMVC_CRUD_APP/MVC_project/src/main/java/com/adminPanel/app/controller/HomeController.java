package com.adminPanel.app.controller;

import com.adminPanel.app.dao.ProductDaoImpl;
import com.adminPanel.app.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @Autowired
    private ProductDaoImpl productDao;

    @RequestMapping("/find")
    public String find(Model model){
        Product product = productDao.findById(1);
        if (product == null) {
            // Log a message to help with debugging
            System.out.println("Product not found with ID: 1");

            // You can also log an error message using a logging framework
            // logger.error("Product not found with ID: 1");

            // Add a message or error to the model to display to the user
            model.addAttribute("errorMessage", "Product not found with the specified ID.");

            // Return an error page or a different view (e.g., product-not-found.jsp)
            return "product-not-found"; // This view should show an error message to the user
        }

        // If product is found, add it to the model
        model.addAttribute("product", product);

        return "view";
    }

}
