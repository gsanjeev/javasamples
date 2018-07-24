package com.laxtech;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaBuiltInInterfaceExample {

    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer(1, "David", 1000.0),
                new Customer(2, "Mike", 2000.0)
        );
        double limit = 1500;


        Collections.sort(customers, (c1, c2) -> c1.getName().compareTo(c2.getName())); // sort customer by name


        System.out.println("all customer");
        System.out.println("------------------------------------------------------------------------");
        displayCustomer(customers, c -> true, c -> System.out.println(c));

        System.out.println("\nCustomer with credit limit less than or equal " + limit);
        System.out.println("------------------------------------------------------------------------");
        displayCustomer(customers, c -> c.getCreditLimit () <= limit, c -> System.out.println(c));

        System.out.println("\nCustomer with credit limit greater than " + limit);
        System.out.println("------------------------------------------------------------------------");
        displayCustomer(customers, c -> c.getCreditLimit () > limit, c -> System.out.println("This is preferred customer\n---->>>>>>>>>" + c));

    }

    private static void displayCustomer(List<Customer> customers, Predicate<Customer> predicate, Consumer<Customer> consumer) {
        for (Customer c : customers) {
            if (predicate.test(c)) { // lambda for dynamic condition
                consumer.accept(c); //lambda for dynamic behaviour/print operation
            }
        }
    }
}

