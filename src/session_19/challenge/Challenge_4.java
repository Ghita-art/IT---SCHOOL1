package session_19.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge_4 {
        public static void main(String[] args) {
            List<String> strings = Arrays.asList("One", "Two", "Three", "Four");

            String concatenatedString = strings.stream()
                    .collect(Collectors.joining(","));

            System.out.println(concatenatedString);
        }
    }
