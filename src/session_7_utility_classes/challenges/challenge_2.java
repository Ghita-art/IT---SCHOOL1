package session_7_utility_classes.challenges;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class challenge_2 {
    public static void displayDAteComponents(String date) {
        LocalDate parsedDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        int year = parsedDate.getYear();
        int month = parsedDate.getMonthValue();
        int day = parsedDate.getDayOfMonth();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }

    public static void main(String[] args) {
        displayDAteComponents(LocalDate.now().toString());
    }
}
