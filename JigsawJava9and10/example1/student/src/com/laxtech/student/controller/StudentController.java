package com.laxtech.student.controller;

import com.laxtech.course.controller.CourseController;
import com.laxtech.student.model.Student;

import java.time.LocalDate;
import java.util.List;
import static java.util.List.of;

public class StudentController {
    private static CourseController courseController = new CourseController();
    private static List<Student> students = of(
            new Student(1, "Mike", "A100", LocalDate.of(1980, 5, 10), 1, courseController.getGradeCourses(1)),
            new Student(2, "James", "A101", LocalDate.of(1988, 1, 20), 1, courseController.getGradeCourses(1)),
            new Student(3, "David", "A102", LocalDate.of(1990, 4, 24), 8, courseController.getGradeCourses(8)),
            new Student(4, "Jon", "B101", LocalDate.of(1999, 11, 29), 8, courseController.getGradeCourses(8))
    );

    public List<Student> getStudents () {
        return students;
    }
}
