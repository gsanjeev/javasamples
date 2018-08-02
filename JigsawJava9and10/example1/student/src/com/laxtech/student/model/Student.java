package com.laxtech.student.model;

import com.laxtech.course.model.Course;
import com.laxtech.course.model.GradeCourse;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Student {
    private int studentId;
    private String name;
    private String rollNum;
    private LocalDate birthDay;
    private int grade;
    private List<GradeCourse> courses;

    public Student(int studentId, String name, String rollNum, LocalDate birthDay, int grade, List<GradeCourse> courses) {
        this.studentId = studentId;
        this.name = name;
        this.rollNum = rollNum;
        this.birthDay = birthDay;
        this.grade = grade;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getRollNum() {
        return rollNum;
    }

    public void setRollNum(String rollNum) {
        this.rollNum = rollNum;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public List<GradeCourse> getCourses() {
        return courses;
    }

    public void setCourses(List<GradeCourse> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        String student = "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", rollNum='" + rollNum + '\'' +
                ", birthDay=" + birthDay +
                ", grade=" + grade +
                ", \ncourses=\n";
        //String courseStr = courses.stream().forEach("", (a,b) -> a.getCourse().getName() + "-" +a.getTeacher().getName());
        String courseStr = courses.stream().map(c -> c.getCourse().getName() + " - " + c.getTeacher().getName() + "\n").collect(Collectors.joining());

        return student + courseStr + '}';
    }
}
