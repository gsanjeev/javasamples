package com.laxtech.consumer;

import com.laxtech.service.spi.StudentServiceInterface;

import java.util.ServiceLoader;
import java.util.stream.Stream;

public class StudentServiceConsumer {

    public static void main(String[] args) {


        Stream<ServiceLoader.Provider<StudentServiceInterface>> providers = ServiceLoader.load(StudentServiceInterface.class).stream().filter(p -> "P1".equals(p.get().getType()));
        StudentServiceInterface p1 = providers.map(ServiceLoader.Provider::get).findFirst().get();
        p1.studentGreeting();

        StudentServiceInterface p2 = ServiceLoader.load(StudentServiceInterface.class).stream()
                .filter(p -> "P2".equals(p.get().getType())).map(ServiceLoader.Provider::get).findFirst().get();
        p2.studentGreeting();

        ServiceLoader.load(StudentServiceInterface.class).stream().map(ServiceLoader.Provider::get).forEach(StudentServiceInterface::studentGreeting);

        ServiceLoader<StudentServiceInterface> serviceLoader = ServiceLoader.load(StudentServiceInterface.class);
        //StudentServiceInterface ps1 = serviceLoader.findFirst().get();
        serviceLoader.iterator().forEachRemaining(StudentServiceInterface::studentGreeting);

        //


    }

}
