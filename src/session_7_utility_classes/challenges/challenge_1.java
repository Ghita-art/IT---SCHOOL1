package session_7_utility_classes.challenges;

import java.time.LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class challenge_1 {
    public static void displayTodaysDate() {
        LocalDate today = LocalDate.now();
        String formattedDate = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Today's date: " + formattedDate);

    }

    public static void main(String[] args) {
        displayTodaysDate();
    }
}
