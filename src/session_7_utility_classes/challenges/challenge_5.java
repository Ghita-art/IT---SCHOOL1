package session_7_utility_classes.challenges;

import java.time.LocalDate;

public class challenge_5 {
    public static boolean isTodaySpecificDate() {
        LocalDate specificDate = LocalDate.of(2019, 12, 10);
        LocalDate today = LocalDate.now();
        return today.isEqual(specificDate);


    }

    public static void main(String[] args) {
        if (isTodaySpecificDate()) {
            System.out.println("Today is 2019-12-10");
        } else {
            System.out.println("Today is not 2019-12-10");
        }
    }
}
