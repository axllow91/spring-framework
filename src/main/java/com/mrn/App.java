package com.mrn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static final String beansPath = "beans.xml";

    public static void main(String[] args) {
        // application context - is the central interface witch provides
        // configuration for an application. Is read-only while app is running
        // Create a new ClassPathXmlApplicationContext, loading the definitions from
        // the given XML file and automatically refreshing the context.
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(beansPath);

        Student student = (Student) applicationContext.getBean("student_bean");
        student.saySomething();

    }
}
