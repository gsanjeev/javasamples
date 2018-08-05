package com.laxtech.service;

import com.laxtech.service.spi.StudentServiceInterface;

import java.util.ServiceLoader;

public class StudentServiceLoader {  // this class is not in use.

    private static StudentServiceLoader ourInstance = new StudentServiceLoader();

    public static StudentServiceLoader getInstance() {
        return ourInstance;
    }

    private StudentServiceLoader() {
    }

    public void printServiceNames() {
        ServiceLoader <StudentServiceInterface> serviceLoader = ServiceLoader.load(StudentServiceInterface.class);
        serviceLoader.iterator().forEachRemaining(service -> service.printServiceName());
    }
}
