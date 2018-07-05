package com.mrn;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    
    private static final String studentBean = "student_bean";

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);

        Student student = (Student) applicationContext.getBean(studentBean);

        student.showInfo();

        ((ConfigurableApplicationContext) applicationContext).close();
    }
}
