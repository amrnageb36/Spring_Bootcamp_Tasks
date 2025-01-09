package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate-config.xml")
                .addAnnotatedClass(Passport.class).addAnnotatedClass(Person.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try
        {
            session.beginTransaction();

            Person person = new Person("amr","nageb","28/10/2000");
             session.save(person);


            Passport passport = new Passport(person,"abcd123456789","10/7/2024");


            session.save(passport);


            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}