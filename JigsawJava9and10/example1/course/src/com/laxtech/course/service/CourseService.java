package com.laxtech.course.service;

import com.laxtech.course.model.Course;
import com.laxtech.course.model.GradeCourse;
import com.laxtech.teacher.controller.TeacherController;
import com.laxtech.teacher.model.Teacher;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.List.of;

public class CourseService {

    TeacherController teacherController = new TeacherController();
    private List<GradeCourse> gradeCourses = of(
            new GradeCourse(1, getCourse(1), teacherController.getTeacher(1)),
            new GradeCourse(1, getCourse(2), teacherController.getTeacher(2)),
            new GradeCourse(1, getCourse(3), teacherController.getTeacher(3)),
            new GradeCourse(1, getCourse(4), teacherController.getTeacher(4)),
            new GradeCourse(8, getCourse(1), teacherController.getTeacher(1)),
            new GradeCourse(8, getCourse(2), teacherController.getTeacher(2)),
            new GradeCourse(8, getCourse(3), teacherController.getTeacher(3)),
            new GradeCourse(8, getCourse(4), teacherController.getTeacher(4))
    );

    private static List<Course> courses = of(
            new Course(1, "Math", "Science"),
            new Course(2, "Science", "Science"),
            new Course(3, "Social Science", "Art"),
            new Course(4, "Hindi", "Art"),
            new Course(4, "Counter", "Science"),
            new Course(4, "French", "Art"),
            new Course(4, "English", "Art")
    );

    public List<Course> getCourses() {
        return courses;
    }

    public Course getCourse(int id) {
        return courses.stream().filter(c -> c.getId() == id).collect(Collectors.toList()).get(0);
    }

    public List<GradeCourse> getGradeCourses(int grade) {
        return gradeCourses.stream().filter(g -> g.getGrade() == grade).collect(Collectors.toList());
    }

}
