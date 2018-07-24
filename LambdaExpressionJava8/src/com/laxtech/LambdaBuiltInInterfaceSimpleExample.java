package com.laxtech;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class LambdaBuiltInInterfaceSimpleExample {

    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer(1, "David", 1000.0),
                new Customer(2, "Mike", 2000.0)
        );
        double limit = 1500;


        Collections.sort(customers, (c1, c2) -> c1.getName().compareTo(c2.getName())); // sort customer by name


        System.out.println("\nAll customer");
        System.out.println("------------------------------------------------------------------------");
        displayCustomer(customers, c -> true);

        System.out.println("\nCustomer with credit limit less than or equal " + limit);
        System.out.println("------------------------------------------------------------------------");
        displayCustomer(customers, c -> c.getCreditLimit () <= limit);

        System.out.println("\nCustomer with credit limit greater than " + limit);
        System.out.println("------------------------------------------------------------------------");
        displayCustomer(customers, c -> c.getCreditLimit () > limit);

    }

    private static void displayCustomer(List<Customer> customers, Predicate<Customer> predicate) {
        for (Customer c : customers) {
            if (predicate.test(c)) {// lambda for dynamic condition
                System.out.println(c); // this operation can be made dynamic using lambda expression
            }
        }
    }


}

