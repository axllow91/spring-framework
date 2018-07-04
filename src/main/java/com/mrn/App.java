package com.mrn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static final String beansPath = "beans.xml";
    private static final String studentBean = "student_bean";

    public static void main(String[] args) {
        // application context - is the central interface witch provides
        // configuration for an application. Is read-only while app is running
        // Create a new ClassPathXmlApplicationContext, loading the definitions from
        // the given XML file and automatically refreshing the context.
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(beansPath);

        Student student1 = (Student) applicationContext.getBean(studentBean);
        student1.setStudentName("Marian");

        System.out.println(student1.getStudentName());

        // printing the name of the student pass in the property bean.xml file
        // System.out.println(student.getStudentName());

        //
        // with the prototype (-> we can use how many instances we want) scope if we don't se the name then will return null because
        // second student object has nothing to do with the first one
        // where in singleton scope there will be created only one single instance of the object
        Student student2 = (Student) applicationContext.getBean(studentBean);
        //student2.setStudentName("Maria");
        System.out.println(student2.getStudentName());

        // close the application context
        ((ConfigurableApplicationContext)  applicationContext).close();
    }
}
