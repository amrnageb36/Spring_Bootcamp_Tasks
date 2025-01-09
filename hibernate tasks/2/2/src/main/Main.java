package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory=new Configuration().configure("hibernate-config.xml").addAnnotatedClass(User.class).addAnnotatedClass(Products.class).buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();


        //select from database
       /* Query query = session.createQuery("from Products");

        List<Products> pList=query.getResultList();

        for(Products products:pList)
            System.out.println(products);*/

        //update from database
        /*Query  query= session.createQuery("update Products set name=:n where id=:i");

        query.setParameter("n","samsung");
        query.setParameter("i",1);

        int status= query.executeUpdate();
        System.out.println(status);*/


       // pagination
       /* Query q = session.createQuery("from Products");

        q.setFirstResult(5);
        q.setMaxResults(10);

        List<Products> list=q.getResultList();
        for(Products products:list)
            System.out.println(products);*/

        //aggregation

        /*Query q=session.createQuery("select sum(price)from Products");

        List<Integer> list=q.getResultList();
        System.out.println(list.get(0));*/


        //session.getTransaction().commit();

    }


}
