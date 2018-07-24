package com.laxtech;

import java.util.Arrays;
import java.util.List;

public class LambdaInCollectionStreamExample {

    public static void main(String[] args) {

        List<Customer> customers = Arrays.asList(
                new Customer(1, "David", 1000.0),
                new Customer(2, "Mike", 2000.0),
                new Customer(1, "James", 4000.0),
                new Customer(2, "Chris", 5000.0)
        );

        System.out.println("\nFiltering and printing customers using collection stream");
        customers.stream()
                .filter(c -> c.getCreditLimit()> 1500)
                .forEach(c -> System.out.println(c));

        System.out.println("\nFiltering and printing customers using collection parallel stream");
        customers.parallelStream()
                .filter(c -> c.getCreditLimit()> 2500)
                .forEach(c -> System.out.println(c));

        System.out.println(customers.parallelStream()
                .filter(c -> c.getCreditLimit()> 2500)
                .count());


    }

}
