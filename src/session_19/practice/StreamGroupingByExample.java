package session_19.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingByExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Alice", "Jack", "Bob", "Brad");

        //group the names by the first letter
        Map<Character, List<String>> groupedByFirstLetter = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(groupedByFirstLetter);
    }
}
