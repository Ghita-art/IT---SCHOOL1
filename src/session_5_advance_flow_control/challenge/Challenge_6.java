package session_5_advance_flow_control.challenge;

import java.util.Scanner;

public class Challenge_6 { // Write a program that asks the user to enter numbers.
    // The program should continue prompting the user until they enter -1.
    // After they enter -1, print the sum of all numbers entered (excluding -1).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != -1) {
            sum += n;
            System.out.println("Enter another number: ");
            n = sc.nextInt();
        }
        System.out.println("The sum is: " + sum);
    }
}
