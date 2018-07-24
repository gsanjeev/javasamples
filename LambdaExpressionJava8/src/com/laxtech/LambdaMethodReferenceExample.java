package com.laxtech;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaMethodReferenceExample {


    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer(1, "David", 1000.0),
                new Customer(2, "Mike", 2000.0)
        );

        Thread t1 = new Thread(() -> greeting()); //Greeting using lambda expression
        t1.start();

        Thread t2 = new Thread(LambdaMethodReferenceExample::greeting);  //Greeting using method reference lambda expression
        t2.start();

        System.out.println("\nDisplay customers using lambda expression.");
        System.out.println("\nDisplay all customers using lambda expression.");
        displayCustomer(customers, c -> true, c -> System.out.println(c)); // conditionally display all customers using lambda expression
        System.out.println("\nDisplay all customers using method reference lambda expression.");
        displayCustomer(customers, c -> true, System.out::println); // conditionally display all customers using method reference lambda expression
    }

    public static void greeting() {
        System.out.println("Hi There!");
    }

    private static void displayCustomer(List<Customer> customers, Predicate<Customer> predicate, Consumer<Customer> consumer) {
        for (Customer p : customers) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }

}
