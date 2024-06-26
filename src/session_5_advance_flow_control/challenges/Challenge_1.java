package session_5_advance_flow_control.challenges;

import java.util.Scanner;

public class Challenge_1 { //Write a Java program that takes an integer as input. If the number is even, print "Even".
    // If it's odd, print "Odd".

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
            sc.close();
        }
    }
}
