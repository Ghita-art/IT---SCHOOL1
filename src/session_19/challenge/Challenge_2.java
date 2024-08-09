package session_19.challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Challenge_2 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        Optional<String> longestString = strings.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(longestString);
    }
}
