package com.laxtech.course.model;

public class Course {
    private int id;
    private String name;
    private String steam;

    public Course(int id, String name, String steam) {
        this.id = id;
        this.name = name;
        this.steam = steam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSteam() {
        return steam;
    }

    public void setSteam(String steam) {
        this.steam = steam;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", steam='" + steam + '\'' +
                '}';
    }
}
