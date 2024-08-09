package session_19.challenge;

import java.util.Arrays;

public class Challenge_6 {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers).sorted()
                .reduce(0, Integer::sum);
        System.out.println("Sum of numbers: " + sum);
    }
}
