package session_19.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge_7 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");

        List<Integer> length = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(length);
    }
}
