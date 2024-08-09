package session_19.challenge;

import java.util.stream.IntStream;

public class Challenge_3 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .filter(PrimeNumbers::isPrime)
                .forEach(System.out::println);
    }
}

