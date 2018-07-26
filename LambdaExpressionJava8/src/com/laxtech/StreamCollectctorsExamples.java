package com.laxtech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectctorsExamples {
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

    }
}
