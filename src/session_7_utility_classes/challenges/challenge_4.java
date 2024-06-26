package session_7_utility_classes.challenges;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class challenge_4 {
    public static boolean areDatesEqual() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first date (YYYY-MM-DD): ");
        String firstDate = sc.nextLine();
        System.out.println("Enter the second date (YYYY-MM-DD): ");
        String secondDate = sc.nextLine();
        sc.close();
        return firstDate.equals(secondDate);


    }

    public static void main(String[] args) {
        boolean areDatesEqual = areDatesEqual();
        if (areDatesEqual) {
            System.out.println("The first date is equal to the second date.");
        } else {
            System.out.println("The first date is not equal to the second date.");
        }
    }
}
