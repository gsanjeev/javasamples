package com.laxtech;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class LambdaExceptionExample {
    public static void main(String[] arg) {
        List<Customer> customers = Arrays.asList(
                new Customer(1, "David", 1000.0),
                new Customer(2, "Mike", 2000.0)
        );
        String increamentCreditLimit = "25";
        increaseLimit(customers, increamentCreditLimit, wrapperLambda((i, l) -> System.out.println("increased cedit limit is:" + l *(100+Integer.parseInt(i))/100)));
    }
    public static void increaseLimit(List<Customer> customers, String increament, BiConsumer<String, Double> consumer) {
/*        for(Customer c : customers) {   //java 7 for loop
            consumer.accept(increament, c.getCreditLimit());
        }*/
        customers.forEach(c -> consumer.accept(increament,c.getCreditLimit())); //java 8 for loop using lambda
    }

    private static BiConsumer<String, Double> wrapperLambda(BiConsumer<String, Double> consumer) {
        return (v, k) ->  {
            try {
                consumer.accept(v, k);
            }
            catch (NumberFormatException e) {
                System.out.println("Error in increamenting credit limit...");
            }

        };
    }

}

