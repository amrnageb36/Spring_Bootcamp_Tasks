package main;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="products")
public class Products {

    @Id
    private int product_id;

    private String name;

    private String description;

    private float price;

    private int stock_quantity;

    private String manufacturer;

    @Temporal(TemporalType.DATE)
    private Date production_date;

    @Override
    public String toString() {
        return "Products{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stock_quantity=" + stock_quantity +
                ", manufacturer='" + manufacturer + '\'' +
                ", production_date=" + production_date +
                '}';
    }
}
