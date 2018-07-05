package com.mrn;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static final String beansPath = "beans.xml";
    private static final String studentBean = "student_bean";

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(beansPath);

        Student student = (Student) applicationContext.getBean(studentBean);

        student.showInfo();

        ((ConfigurableApplicationContext) applicationContext).close();
    }
}
