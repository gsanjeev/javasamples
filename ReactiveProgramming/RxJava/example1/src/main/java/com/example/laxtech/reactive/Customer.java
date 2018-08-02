package com.example.laxtech.reactive;

public class Customer {
    int id;
    String name;
    double creditLimit;
    int age;

    public Customer(int id, String name, double creditLimit) {
        super();
        this.id = id;
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public Customer(int id, String name, double creditLimit, int age) {
        super();
        this.id = id;
        this.name = name;
        this.creditLimit = creditLimit;
        this.age = age;
    }

    public static int compareByNameThanAge(Customer c1, Customer c2) {
        if (c1.getName().equals(c2.getName())) {
            return c1.getAge() - c2.getAge();
        } else {
            return c1.getName().compareTo(c2.getName());
        }
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

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", age=" + age +
                '}';
    }
}
