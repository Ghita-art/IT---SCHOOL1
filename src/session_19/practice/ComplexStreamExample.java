package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class ComplexStreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Jack");

        //filter names that start with the letter "J"
        //make uppercase all the names
        //sort names
        //collect the result into a new list

        List<String> resultList = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .sorted()
                .toList();
        System.out.println(resultList);
    }
}
