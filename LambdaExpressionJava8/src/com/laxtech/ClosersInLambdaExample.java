package com.laxtech;

import java.util.function.Consumer;

public class ClosersInLambdaExample {

    public static void main(String[] args) {
        Integer n1 = 2000;
        Integer n2 = 2500;
        getTotal(n1, num1 -> System.out.println(num1 + n2));

    }


    public static void getTotal(Integer num1, Consumer<Integer> c) {
        System.out.println(num1 + num1);
        c.accept(num1);
    }

}



