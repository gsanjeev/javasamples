package com.laxtech.student;

import com.laxtech.student.controller.StudentController;

public class StudentApp {

    public static void main(String[] argc) {
        StudentController studentController = new StudentController();
        studentController.getStudents().forEach(System.out::println);
    }
}
