package session_19.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge_5 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", "Johnson", 20),
                new Person("Bob", "Smith", 17)
        );


        List<String> resultsList = people.stream()
                .filter(person -> person.getAge() > 18)
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .sorted()
                .toList();
        System.out.println(resultsList);
    }
}
