package com.adminPanel.app.model;



import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int productId;

    @NotBlank(message = "Name is mandatory")
    @Size(max = 100, message = "Name cannot exceed 100 characters")
    @Column(name="name")
    private String name;

    @NotNull(message = "Product details must not be null")
    @OneToOne
    @JoinColumn(name="product_details_id")
    private ProductDetails productDetails;

    public Product(String name, ProductDetails productDetails) {
        this.name = name;
        this.productDetails = productDetails;
    }

    public Product() {
    }

    public int getId() {
        return productId;
    }

    public void setId(int id) {
        this.productId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }
}
