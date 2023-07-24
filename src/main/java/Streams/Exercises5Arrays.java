package Streams;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Exercises5Arrays {

    public static void main(String[] args) {
        IntStream numStream = Arrays.stream(new int[]{1,2,3,4,5});
        numStream.forEach(System.out::println);

        LongStream longStream = Arrays.stream(new long[]{1,2,3,4,5});
        longStream.forEach(System.out::println);

        DoubleStream doubleStream = Arrays.stream(new double[]{1,2,3,4,5});
        doubleStream.forEach(System.out::println);

        System.out.println("*************");
        System.out.println("Create diffrents kind of streams");

        Set<String> lenguajesSet = new HashSet<>();
        lenguajesSet.add("Java");
        lenguajesSet.add("Python");
        lenguajesSet.add("C#");

        System.out.println("Create diffrents kind of streams SET");

        Stream<String> lenguajesStream = lenguajesSet.parallelStream();
        lenguajesStream.forEach(System.out::println);

        List<String> lenguajesList = new ArrayList<>();
        lenguajesList.add("Java");
        lenguajesList.add("Python");
        lenguajesList.add("C#");

        System.out.println("Create diffrents kind of streams LIST");

        Stream<String> lenguajesStream2 = lenguajesList.parallelStream();
        lenguajesStream2.map(String::toUpperCase).forEach(System.out::println);
    }


}
