package session_3_java_operators.challenges;

import java.util.Scanner;

public class Extra_Challenge_6 {
    //Age Verification
    //Write a Java program to verify if a person is eligible to vote. Given a person's age,
    // if the age is 18 or above, print "Eligible to vote", otherwise print "Not eligible to vote".
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        while (true) {
            if (age >= 18) {
                System.out.println("You are eligible to vote");
                age = sc.nextInt();
            } else {
                System.out.println("You are not eligible to vote");
            }
            break;
        }
    }
}
