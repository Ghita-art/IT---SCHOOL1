package session_7_utility_classes.challenges;

import java.time.LocalDate;

public class challenge_7 {
    public static void main(String[] args) {
        int numberOfWeeks = 4;
        System.out.println("The date after added" + numberOfWeeks + "weeks is" + addWeeksToToday(numberOfWeeks));
    }

    public static LocalDate addWeeksToToday(int numberOfWeeks) {
        LocalDate today = LocalDate.now();
        return today.plusWeeks(numberOfWeeks);
    }
}
