package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Jack");

        //filter names that starts with the letter "J"
        names.stream()
                .filter(name -> name.startsWith("J"))
                .forEach(name -> System.out.println(name));
    }
}
