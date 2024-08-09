package session_19.challenge;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Challenge_11 {
    public static void main(String[] args) {

        String filePath = "path/to/your/file.txt";

        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {

            Optional<String> longestWord = lines
                    .flatMap(line -> Arrays.stream(line.split(" \\s+ ")))
                    .max(Comparator.comparingInt(String::length));

            longestWord.ifPresent(word -> System.out.println("The longest word is: " + word));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

