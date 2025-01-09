package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class create {

    public static void main(String[] args) {
SessionFactory sessionFactory = new Configuration().configure("hibernate-config.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        try
        {
            session.beginTransaction();


            Student student = new Student("amr", "mohamed");


            session.save(student);

            session.getTransaction().commit();
        }
       catch(Exception e)
       {
            e.printStackTrace();
        }
    }


}
