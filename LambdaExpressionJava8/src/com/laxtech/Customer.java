package com.laxtech;

public class Customer {
    int id;
    String name;
    double creditLimit;

    public Customer(int id, String name, double creditLimit) {
        this.id = id;
        this.name = name;
        this.creditLimit = creditLimit;
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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
