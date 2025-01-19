package com.adminPanel.app.dao;

import com.adminPanel.app.model.Product;
import com.adminPanel.app.model.ProductDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao{



    @Autowired
    private SessionFactory sessionFactory;



    @Override
    @Transactional
    public ProductDetails insert(ProductDetails productDetails)
    {
        try{
            Session session = sessionFactory.getCurrentSession();

            int productDetailsId = (int) session.save(productDetails);

            Product product=new Product();

            product.setName(productDetails.getName());
            product.setProductDetails(session.get(ProductDetails.class,productDetailsId));
            session.save(product);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return productDetails;
    }

    @Override
    @Transactional
    public Product findById(int id) {
       try{
           Session session = sessionFactory.getCurrentSession();
           return session.get(Product.class, id);

       } catch (Exception e) {
           throw new RuntimeException(e);
       }

    }

    @Override
    @Transactional
    public void deleteById(int id) {
        try {
            Session session=sessionFactory.getCurrentSession();

            //to delete the product
            Product product=session.get(Product.class,id);
            Query query = session.createQuery("delete from Product where id=:productId");
            query.setParameter("productId",id);
            query.executeUpdate();

            //to delete product details
            query=session.createQuery("delete from ProductDetails where id=:productDetailsId");
            query.setParameter("productDetailsId",product.getProductDetails().getId());
            query.executeUpdate();

            /*Product product=session.get(Product.class,id);
            session.delete(product);*/
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    @Transactional
    public void update(ProductDetails productDetails) {
      try
      {
          Session session = sessionFactory.getCurrentSession();

          /*Query query = session.createQuery("update Product set name=:name where id=:productId");
          query.setParameter("name", product.getName());
          query.setParameter("productId", product.getId());
          query.executeUpdate();


          query = session.createQuery("update ProductDetails set name=:n ,expiration_date=:expiration_date ,manufacturer=:manufacturer," +
                  "price=:price, available=:available where id=:productDetailsId");
          query.setParameter("n", product.getName());
          query.setParameter("expiration_date", product.getExpirationDate());
          query.setParameter("manufacturer", product.getManufacturer());
          query.setParameter("price", product.getPrice());
          query.setParameter("available", product.getAvailable());
          query.setParameter("productDetailsId", product.getId());
          query.executeUpdate();

          session.flush();*/

          Product product = session.get(Product.class,productDetails.getProduct().getId());
          if (product == null) {
              throw new IllegalArgumentException("Product cannot be null");
          }
          product.setName(productDetails.getName());

          ProductDetails productDetailsEntity = product.getProductDetails();
          if (productDetailsEntity == null) {
              throw new IllegalArgumentException("ProductDetails cannot be null");
          }
          productDetailsEntity.setName(product.getName());
          productDetailsEntity.setExpirationDate(productDetails.getExpirationDate());
          productDetailsEntity.setManufacturer(productDetails.getManufacturer());
          productDetailsEntity.setPrice(productDetails.getPrice());
          productDetailsEntity.setAvailable(productDetails.getAvailable());

          session.update(product);
          session.update(productDetailsEntity);


      } catch (Exception e) {
          throw new RuntimeException(e);
      }

    }

    @Override
    @Transactional
    public List<Product> getAllProducts() {
        List<Product> productList = null;

        try {
            Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("from Product");

            productList = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }
}
