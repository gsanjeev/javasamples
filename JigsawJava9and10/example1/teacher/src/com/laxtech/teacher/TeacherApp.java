package com.laxtech.teacher;

import com.laxtech.teacher.service.TeacherService;

public class TeacherApp {

    public static void main(String argc) {
        TeacherService teacherController = new TeacherService();
        teacherController.getTeachers().forEach(System.out::println);
    }
}
