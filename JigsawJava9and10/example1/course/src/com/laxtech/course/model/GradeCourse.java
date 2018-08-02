package com.laxtech.course.model;

import com.laxtech.teacher.model.Teacher;

public class GradeCourse {
    private int grade;
    private Course course;
    private Teacher teacher;

    public GradeCourse(int grade, Course course, Teacher teacher) {
        this.grade = grade;
        this.course = course;
        this.teacher = teacher;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "GradeCourse{" +
                "grade=" + grade +
                ", course=" + course +
                ", teacher=" + teacher +
                '}';
    }
}
