package com.laxtech.teacher.model;

import java.time.LocalDate;

public class Teacher {
    private int staffId;
    private String name;
    private LocalDate birthDate;

    public Teacher(int staffId, String name, LocalDate birthDate) {
        this.staffId = staffId;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "com.laxtech.teacher.model.Teacher{" +
                "staffId=" + staffId +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
