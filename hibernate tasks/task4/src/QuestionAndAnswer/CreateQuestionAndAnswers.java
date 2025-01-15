package QuestionAndAnswer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateQuestionAndAnswers {
        public static void main(String[] args) {
            SessionFactory sessionFactory = new Configuration().configure("hibernate-config.xml")
                    .addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class)
                    .buildSessionFactory();

            Session session = sessionFactory.getCurrentSession();

            try {
                session.beginTransaction();

                Question question = new Question("firstQuestion");

                List<Answer> answers = new ArrayList<>();

                Collections.addAll(answers,
                        new Answer("Q1 1st answer"),
                        new Answer("Q1 2nd answer"));

                for(Answer a: answers){
                    session.save(a);
                }
                question.setAnswers(answers);
                session.save(question);


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








