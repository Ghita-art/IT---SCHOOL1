package session_19.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge_13 {
    public static void main(String[] args) {

        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");


        int product = numbers.stream()
                .map(Integer::parseInt)
                .reduce(1, (a, b) -> a * b);

        System.out.println("The product of all numbers is: " + product);
    }
}
