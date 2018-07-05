package com.mrn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    // With the help of @Qualifier annotation spring framework will know what method should
    // inject into student class
    @Qualifier(value="2")
    private Address address;

    public Student() { }

    public Student(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    //@Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public void showInfo() {
        System.out.println("Student address is: " + address.getAddress());
    }
}
