package com.laxtech.student;

import com.laxtech.student.controller.StudentController;

import static javax.xml.XMLConstants.XML_NS_PREFIX;

public class StudentApp {

    public static void main(String[] argc) {
        StudentController studentController = new StudentController();
        studentController.getStudents().forEach(System.out::println);
        System.out.println("The XML namespace prefix is: " + XML_NS_PREFIX); // this requires java.xml; and has been add in mdoule-info.java
    }
}
