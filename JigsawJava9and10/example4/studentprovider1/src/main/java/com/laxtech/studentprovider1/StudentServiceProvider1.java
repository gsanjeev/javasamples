package com.laxtech.studentprovider1;

import com.laxtech.service.spi.StudentServiceInterface;

public class StudentServiceProvider1 implements StudentServiceInterface {
    @Override
    public void studentGreeting() {
        System.out.println("Hello from Student Service Provider 1");
    }

    @Override
    public void printServiceName() {
        System.out.println("This is Student Service Provider 1");
    }

    @Override
    public String getType() {
        return "P1";
    }
}
