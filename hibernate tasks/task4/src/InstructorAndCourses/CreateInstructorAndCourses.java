package InstructorAndCourses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateInstructorAndCourses {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate-config.xml")
                .addAnnotatedClass(Course.class).addAnnotatedClass(Instructor.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            Instructor instructor = new Instructor("ahmed","mohamed","ahmed@gmail.com");

            List<Course> courses = new ArrayList<>();
            Collections.addAll(courses, new Course("math",instructor),new Course("arabic",instructor),new Course("physics",instructor));
            for(Course c: courses){
                session.save(c);
            }
            instructor.setCourses(courses);
            session.save(instructor);

            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}

