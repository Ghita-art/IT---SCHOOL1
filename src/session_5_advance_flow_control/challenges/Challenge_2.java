package session_5_advance_flow_control.challenges;

import java.util.Scanner;

public class Challenge_2 { // Write a program that asks the user to enter a number between 1 and 12.
    // Print the name of the corresponding month or "Invalid Month" if out of range.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12: ");
        int monthNumber = sc.nextInt();
        if (monthNumber >= 1 && monthNumber <= 12) {
            String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            System.out.println(months[monthNumber - 1]);
        } else {
            System.out.println("Unknown Month");
            sc.close();
        }
    }
}

