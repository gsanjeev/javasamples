package com.laxtech.teacher.controller;

import com.laxtech.teacher.model.Teacher;
import com.laxtech.teacher.service.TeacherService;

import java.util.List;

public class TeacherController {
    private static TeacherService teacherService = new TeacherService();


    public List<Teacher> getTeachers () {
        return teacherService.getTeachers();
    }

    public Teacher getTeacher(int id) {
        return teacherService.getTeacher(id);
    }

}
