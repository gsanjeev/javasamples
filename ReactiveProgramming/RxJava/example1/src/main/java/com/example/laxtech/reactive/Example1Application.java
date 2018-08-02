package com.example.laxtech.reactive;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class Example1Application {

    public static void main(String[] args) {
        SpringApplication.run(Example1Application.class, args);
        Flowable.just("Hello world").subscribe(System.out::println);

        Observable<String> observable = Observable.just("how", "to", "do", "in", "java");
        Consumer<? super String> consumer = System.out::println;
        observable.subscribe(consumer);

        Observable<String> observable2 = Observable.just("how", "to", "do", "in", "java");
        observable2.map(s -> s.toUpperCase()).subscribe(System.out::println);

        List<Customer> customers = List.of(
                new Customer(1, "Jack", 1000.0, 25),
                new Customer(2, "Mike", 2000.0, 40),
                new Customer(3, "David", 2000.0, 32),
                new Customer(4, "Sarah", 5000.0, 26)
        );
        Observable<Customer> customerObservable = Observable.fromIterable(customers);
        customerObservable.subscribe(System.out::println, Throwable::printStackTrace,
                () -> System.out.println("Customer Processed."));

        Observable<Customer> customerObservable2 = Observable.create(source -> { //publisher of events
            customers.stream().forEach(c -> {
                source.onNext(c);
                sleep(1000);
                //source.onError(new Exception("Error in pushing customer."));
            });
            source.onComplete();
        });
        customerObservable2.subscribe(System.out::println, Throwable::printStackTrace,
                () -> System.out.println("Customer Processing completed.")); //consumer of data/ events
    }

    private static void sleep(int i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
