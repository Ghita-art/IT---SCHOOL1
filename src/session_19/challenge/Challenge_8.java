package session_19.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge_8 {
    public static void main(String[] args) {

        String sentence = "Hello world";
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        long vowelCount = sentence.chars()
                .filter(c -> vowels.contains((char) c))
                .count();
        System.out.println("The number of vowels is: " + vowelCount);
    }
}
