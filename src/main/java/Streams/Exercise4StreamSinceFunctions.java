package Streams;

import java.util.stream.Stream;

public class Exercise4StreamSinceFunctions {

    public static void main(String[] args) {
        Stream<Long> primerosDiez = Stream.iterate(1l, x -> x + 1l)
                .limit(10);
        primerosDiez.forEach(System.out::println);

        Stream.iterate(10L, x -> x + 1l)
                //.filter(x-> x>=20)
                //.filter(x-> x<=30)
                .filter(x -> x%2 == 0)
                .skip(10)
                .limit(100)
                .forEach(System.out::println);

        Stream.generate(() -> Math.random())
                .limit(10)
                .forEach(System.out::println);
    }
}
