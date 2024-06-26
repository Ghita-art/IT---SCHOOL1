package session_7_utility_classes.challenges;

import java.time.LocalDate;
import java.time.Month;

public class challenge_3 {
    public static LocalDate createSpecificDate() {
        // Create a LocalDate object for 2025-08-19
        LocalDate specificDate = LocalDate.of(2025, Month.AUGUST, 19);
        return specificDate;
    }

    public static void main(String[] args) {
        LocalDate specificDate = createSpecificDate();
        System.out.println("The specific date is: " + specificDate);
    }
}



