package session_19.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge_10 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");

        long totalChars = strings.stream()
                .flatMapToInt(String::chars)
                .filter(c -> !Character.isWhitespace(c))
                .count();

        System.out.println("Total number of non-whitespace characters: " + totalChars);
    }
}
