package session_3_java_operators.challenges_Session_3;

import java.util.Scanner;

public class Challenge_14 {
    //Create a program that checks if a user entered number is within a specific range (e.g., [1-100]).
    //        Use relational operators for the checks.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your nummber, please! : ");
        int number = sc.nextInt();
        while (true) {
            if (number < 1) {
                System.out.println("The number " + number + " is too low, please try again");
                number = sc.nextInt();
            } else if (number > 100) {
                System.out.println("The number " + number + " is too high, please try again");
                number = sc.nextInt();
            } else {
                System.out.println("Well done! The number is between [1,100]");
                break;
            }
        }
    }
}
