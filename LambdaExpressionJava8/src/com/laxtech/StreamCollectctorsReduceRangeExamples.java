package com.laxtech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCollectctorsReduceRangeExamples {
    public static void main(String[] args) {

        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
        List<String> names = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");

        String concatVowels7 = "";  // concat using java 7 way
        for (String v: vowels) {
            concatVowels7 += v + " ";
        }
        System.out.println(concatVowels7);

        String concatVowels8 = vowels.stream().collect(Collectors.joining(" ")); // concat using java 8 way
        System.out.println(concatVowels8);

        //Filter name start with "S"
        List<String> aName7 = new ArrayList<>(); // java 7 way
        for (String name: names) {
            if(name.startsWith("S")) {
                aName7.add(name);
            }
        }
        System.out.println(aName7);

        List<String> aName8 = names.stream().filter(n -> n.startsWith("S")).collect(Collectors.toList()); // java 8 way
        System.out.println(aName8);


        //Stream Reducer
        List<Integer> runsInMatch = Arrays.asList(20, 56, 72, 18, 44);

        Integer totalRun7 = 0;   // Java 7 way
        for(Integer run: runsInMatch) {
            totalRun7 += run;
        }
        System.out.println(totalRun7);

        Integer totalRun8 = runsInMatch.stream().reduce(0, (a,b) -> a+b); //Java 8 way
        System.out.println(totalRun8);

        Stream<Customer> customerStream = IntStream.range(1, 5).mapToObj(i -> getCustomer(i));
        System.out.println("Count " + customerStream.count());

        IntStream.range(1, 5).mapToObj(i -> getCustomer(i)).forEach(System.out::println);

        IntStream.range(1, 5).forEach(i -> normalOperation(i));

        IntStream.range(1, 5).parallel().forEach(i -> heavyOperation(i));
    }

    static List<Customer>  customers = Arrays.asList(
            new Customer(1, "Jack", 1000.0, 25),
            new Customer(2, "Mike", 2000.0, 40),
            new Customer(3, "David", 2000.0, 32),
            new Customer(4, "Sarah", 5000.0, 26)
    );

    private static Customer getCustomer(int i) {
        return customers.get(i-1);
    }

    private static void normalOperation(int i) {
        System.out.println("This normal operation. " + i);
    }

    private static void heavyOperation(Integer i) {
        System.out.println("This heavy operation. " + i);
    }
}
