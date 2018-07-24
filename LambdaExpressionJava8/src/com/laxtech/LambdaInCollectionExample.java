package com.laxtech;

import java.util.Arrays;
import java.util.List;

public class LambdaInCollectionExample {

    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer(1, "David", 1000.0),
                new Customer(2, "Mike", 2000.0));

        System.out.println("\nLambda in Collection Example");

        System.out.println("\nFor loop using java 7 way");
        for (Customer c : customers) {
            System.out.println(c);
        }

        System.out.println("\nFor loop using java 8 way - lambda expression");
        customers.forEach(c -> System.out.println(c));

        System.out.println("\nFor loop using java 8 way - method reference");
        customers.forEach(System.out::println);
    }

    }
