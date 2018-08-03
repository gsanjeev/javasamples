package com.laxtech.course;

import com.laxtech.teacher.TeacherModule;

public class CourseModule {
    public static void main(String[] args){
        System.out.println("This is couse module.");
        TeacherModule teacherModule = new TeacherModule();
        teacherModule.greeting();
    }
}
