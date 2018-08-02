package com.laxtech.course.controller;

import com.laxtech.course.model.Course;
import com.laxtech.course.model.GradeCourse;
import com.laxtech.course.service.CourseService;

import java.util.List;
import java.util.stream.Collectors;

public class CourseController {

    private static CourseService courseService = new CourseService();

    public List<Course> getCourses() {
        return courseService.getCourses();
    }

    public Course getCourse(int id) {
        return courseService.getCourse(id);
    }

    public static List<GradeCourse> getGradeCourses(int grade) {
        return courseService.getGradeCourses(grade);
    }
}
