package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Rectangle rectangle= container.getBean("rectangle", Rectangle.class);
        rectangle.setH(3);
        rectangle.setW(3);
        System.out.println("Rectangle area = "+rectangle.getArea());

//=================================================================================================================

        Circle circle= container.getBean("circle", Circle.class);
        circle.setR(3);
        System.out.println("Circle area = "+circle.getArea());



        }
    }
