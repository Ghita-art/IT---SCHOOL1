package session_7_utility_classes.challenges;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class challenge_9 {
    public static void main(String[] args) {
        System.out.println(daysBetween());
    }

    public static long daysBetween() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the first date:");
        String firstDate = sc.nextLine();
        System.out.println("Please, enter the second date:");
        String secondDate = sc.nextLine();

        LocalDate parsedFirstDate = LocalDate.parse(firstDate);
        LocalDate parsedSecondDate = LocalDate.parse(secondDate);

        sc.close();

        return ChronoUnit.DAYS.between(parsedFirstDate, parsedSecondDate);
    }
}

