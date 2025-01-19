package com.adminPanel.app.controller;

import com.adminPanel.app.dao.ProductDaoImpl;
import com.adminPanel.app.model.Product;
import com.adminPanel.app.model.ProductDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private ProductDaoImpl productDao;

    @RequestMapping("/showProductDetails")
    public String showProductDetails(@ModelAttribute("productId") int id, Model model){
        Product product = productDao.findById(id);
        model.addAttribute("product", product);
        return "view";
    }
    @RequestMapping("/delete")
    public String delete(@ModelAttribute("productId")int id, Model model){
        productDao.deleteById(id);
        return "redirect:/all";
    }
    @RequestMapping("/all")
    public String all(Model model){
       model.addAttribute("products",productDao.getAllProducts());
        return "all";
    }

    @RequestMapping("/AddPage")
    public String addPage(Model model)
    {
        model.addAttribute("productModel",new ProductDetails());
        return "add-product";
    }

    @RequestMapping("addProduct")
    public String addProduct(@Valid @ModelAttribute("productModel")ProductDetails productDetailsModel,BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors())
            return "update-product-page";
       ProductDetails productDetails= productDao.insert(productDetailsModel);
       model.addAttribute("product",productDetails);

        return "redirect:/all";
    }

    @RequestMapping("/updatePage" )
    public String updatePage(@ModelAttribute("productId") int productId, Model model){

        Product product=productDao.findById(productId);
        ProductDetails productDetails=product.getProductDetails();
        model.addAttribute("product",product);
        model.addAttribute("productDetails",productDetails);

        return "update-product-page";

    }

    @PostMapping ("/updateProduct")
    public String updateProduct(@Valid @ModelAttribute("productDetails")ProductDetails productDetails, BindingResult bindingResult,
                                Model model){
        if(bindingResult.hasErrors())
            return "update-product-page";
        productDao.update(productDetails);

        return "redirect:/all";

    }
}
