package com.laxtech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortingTest {



    @Test
    public void testPreLambdaSort() {
        List<Customer> customers = Arrays.asList(
                new Customer(1, "Jack", 1000.0, 25),
                new Customer(2, "Mike", 2000.0, 40),
                new Customer(3, "David", 2000.0, 32),
                new Customer(4, "Sarah", 5000.0, 26)
        );

        Collections.sort(customers, new Comparator<Customer>() { //sorting using anonymous class
            @Override
            public int compare(Customer c1, Customer c2) {
                return c1.getName().compareTo(c2.getName());
            }
        });
        assertEquals("David", customers.get(0).name);
    }

    @Test
    public void testLambdaSort() {
        List<Customer> customers = Arrays.asList(
                new Customer(1, "Jack", 1000.0, 25),
                new Customer(2, "Mike", 2000.0, 40),
                new Customer(3, "David", 2000.0, 32),
                new Customer(4, "Sarah", 5000.0, 26)
        );

        Collections.sort(customers, (c1, c2) -> c1.getName().compareTo(c2.getName())); //sorting using inline lambda expression

        assertEquals("David", customers.get(0).name);
    }

    @Test
    public void testStaticMethodReferenceSort() {
        List<Customer> customers = Arrays.asList(
                new Customer(1, "Jack", 1000.0, 25),
                new Customer(2, "Mike", 2000.0, 40),
                new Customer(3, "David", 2000.0, 32),
                new Customer(3, "David", 4000.0, 25),
                new Customer(4, "Sarah", 5000.0, 26)
        );

        Collections.sort(customers, Customer::compareByNameThanAge); //sorting using static method reference

        assertEquals("David", customers.get(0).name);
        assertEquals(25, customers.get(0).age);
    }

    @Test
    public void testInstanceMethodRerenceSort() {
        List<Customer> customers = Arrays.asList(
                new Customer(1, "Jack", 1000.0, 25),
                new Customer(2, "Mike", 2000.0, 40),
                new Customer(3, "David", 2000.0, 32),
                new Customer(3, "David", 4000.0, 25),
                new Customer(4, "Sarah", 5000.0, 26)
        );

        Collections.sort(customers, Comparator.comparing(Customer::getName)); //sorting using instance method reference

        assertEquals("David", customers.get(0).name);
    }


    @Test
    public void testLambdaReverseSort() {
        List<Customer> customers = Arrays.asList(
                new Customer(1, "Jack", 1000.0, 25),
                new Customer(2, "Mike", 2000.0, 40),
                new Customer(3, "David", 2000.0, 32),
                new Customer(4, "Sarah", 5000.0, 26)
        );

        Comparator<Customer> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
        //Collections.sort(customers, comparator.reversed()); //reverse sorting using inline lambda expression
        customers.sort(comparator.reversed()); // same as Collections.sort(customers, comparator.reversed());

        assertEquals("Sarah", customers.get(0).name);
    }

    @Test
    public void testLambdaMultipleConditionInComparatorSort() {
        List<Customer> customers = Arrays.asList(
                new Customer(1, "Jack", 1000.0, 25),
                new Customer(2, "Mike", 2000.0, 40),
                new Customer(3, "David", 2000.0, 32),
                new Customer(3, "David", 4000.0, 25),
                new Customer(4, "Sarah", 5000.0, 26)
        );

        customers.sort((c1, c2) -> {
                    if (c1.getName().equals(c2.getName()))
                        return c1.getAge() - c2.getAge();
                    else
                        return c1.getName().compareTo(c2.getName());
                });   // //multiple condition comparator sorting using inline lambda expression

        assertEquals("David", customers.get(0).name);
        assertEquals(25, customers.get(0).age);
    }

    @Test
    public void testLambdaMultipleConditionUsingComparatorChainSort() {
        List<Customer> customers = Arrays.asList(
                new Customer(1, "Jack", 1000.0, 25),
                new Customer(2, "Mike", 2000.0, 40),
                new Customer(3, "David", 2000.0, 32),
                new Customer(3, "David", 4000.0, 25),
                new Customer(4, "Sarah", 5000.0, 26)
        );

        customers.sort(Comparator.comparing(Customer::getName).thenComparing(Customer::getAge)); //multiple condition comparator sorting using comparator chain with method reference

        assertEquals("David", customers.get(0).name);
        assertEquals(25, customers.get(0).age);
    }
}
