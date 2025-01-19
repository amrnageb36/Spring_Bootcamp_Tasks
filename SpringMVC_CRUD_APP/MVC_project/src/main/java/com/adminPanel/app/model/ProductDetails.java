package com.adminPanel.app.model;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name="product_details")
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @NotBlank(message = "Name is mandatory")
    @Size(max = 100, message = "Name cannot exceed 100 characters")
    @Column(name="name")
    private String name;

    @NotNull(message = "Expiration date is required")
    @FutureOrPresent(message = "Expiration date must be today or in the future")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="expiration_date")
    private Date expirationDate;

    @NotBlank(message = "Manufacturer is mandatory")
    @Size(max = 100, message = "Manufacturer name cannot exceed 100 characters")
    @Column(name="manufacturer")
    private String manufacturer;

    @NotNull(message = "Price must not be null")
    @Positive(message = "Price must be greater than zero")
    @Column(name="price")
    private double price;

    @NotNull(message = "Availability must not be null")
    @Column(name="available")
    private Boolean available;

    @OneToOne(mappedBy = "productDetails",cascade = CascadeType.ALL)
    private Product product;

    public ProductDetails(String name, Date expirationDate, String manufacturer, double price, Boolean available, Product product) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.manufacturer = manufacturer;
        this.price = price;
        this.available = available;
        this.product = product;
    }

    public ProductDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
