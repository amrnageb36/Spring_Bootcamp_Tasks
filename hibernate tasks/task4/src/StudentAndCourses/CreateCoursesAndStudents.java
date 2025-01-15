package StudentAndCourses;

import InstructorAndCourses.Course;
import InstructorAndCourses.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateCoursesAndStudents {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate-config.xml")
                .addAnnotatedClass(Courses.class).addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            Student student1 = new Student("Amr");
            Student student2 = new Student("Mohamed");
            Student student3 = new Student("Nageb");

            // Create courses
            Courses course1 = new Courses("Math");
            Courses course2 = new Courses("Arabic");
            Courses course3 = new Courses("Physics");

            // Add students to courses
            course1.addStudent(student1);
            course1.addStudent(student2);
            course2.addStudent(student2);
            course2.addStudent(student3);
            course3.addStudent(student1);
            course3.addStudent(student3);

            // Add courses to students
            student1.addCourse(course1);
            student1.addCourse(course3);
            student2.addCourse(course1);
            student2.addCourse(course2);
            student3.addCourse(course2);
            student3.addCourse(course3);

            // Save data
            session.save(student1);
            session.save(student2);
            session.save(student3);

            session.save(course1);
            session.save(course2);
            session.save(course3);

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
