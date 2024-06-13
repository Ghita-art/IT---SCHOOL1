package Challenges_Session_3;

import java.util.Scanner;

public class Challenge_3 {
    public static void main(String[] args) {
        // 3. Write a program to check if a number is positive or negative using logical complement operator.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int myNumber = sc.nextInt();
        if (myNumber > 0) {
            System.out.println("The number is positive");
        } else if (myNumber < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}

