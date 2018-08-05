package com.laxtech.studentprovider2;

import com.laxtech.service.spi.StudentServiceInterface;

public class StudentServiceProvider2 implements StudentServiceInterface {
    @Override
    public void studentGreeting() {
        System.out.println("Hello! This greeting from Provider 2");

    }

    @Override
    public void printServiceName() {
        System.out.println("StudentServiceProvider2");

    }

    @Override
    public String getType() {
        return "P2";
    }
}
