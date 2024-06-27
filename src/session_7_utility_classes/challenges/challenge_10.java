package session_7_utility_classes.challenges;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class challenge_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a date (yyyy-MM-dd): ");
        String dateString = sc.nextLine();

        boolean valid = isValidDate(dateString);
        System.out.println("Is the date valid? " + valid);
    }

    public static boolean isValidDate(String dateString) {
        try {
            LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}

