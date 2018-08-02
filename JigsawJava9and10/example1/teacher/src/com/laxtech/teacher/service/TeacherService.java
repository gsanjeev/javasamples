package com.laxtech.teacher.service;

import com.laxtech.teacher.model.Teacher;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.List.of;

public class TeacherService {
    private static List<Teacher> teachers = of(
            new Teacher(1, "Mike", LocalDate.of(1980, 5, 10)),
            new Teacher(2, "James", LocalDate.of(1988, 1, 20)),
            new Teacher(3, "David", LocalDate.of(1990, 4, 24)),
            new Teacher(4, "Jon", LocalDate.of(1999, 11, 29))
    );


    public List<Teacher> getTeachers () {
        return teachers;
    }

    public Teacher getTeacher(int id) {
        return teachers.stream().filter(c -> c.getStaffId() == id).collect(Collectors.toList()).get(0);
    }

}
