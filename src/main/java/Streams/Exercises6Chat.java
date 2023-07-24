package Streams;

import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Exercises6Chat {

    public static void main(String[] args) {

        String entrada = new String("Hola, como estas?");
        IntStream readMessage = entrada.codePoints();

        // remove spaces
        readMessage.filter(x -> {
           return x != 32; // this a space in char " "
        }).forEach(n -> System.out.print((char)n));

        System.out.println("\n*************");
        //for each spaces create a array
        String str = "Hola, como estas?";
        Pattern.compile(" ")
                .splitAsStream(str)
                .forEach(System.out::println);
        ;




    }



}
