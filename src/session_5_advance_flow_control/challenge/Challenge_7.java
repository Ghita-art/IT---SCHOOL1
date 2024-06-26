package session_5_advance_flow_control.challenge;

import java.util.Scanner;

public class Challenge_7 {//Create a program where the user is prompted to guess a predefined number.

    // After each guess, the program should inform the user if the guess is too high or too low.
    // The program should keep prompting the user until they guess correctly.
    // Using a do-while loop, ensure the user is always asked at least once.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctNumber = 10;
        int guessNumber;
        System.out.println("Please enter a number:");
        do {
            guessNumber = sc.nextInt();
            if (guessNumber < correctNumber) {
                System.out.println("Your number is too low!");
            } else if (guessNumber > correctNumber) {
                System.out.println("Your number is too high!");
            } else if (guessNumber == correctNumber) {
                System.out.println("Congratulations! You guessed correctly!");
            }
        } while (guessNumber != correctNumber);
        sc.close();
    }
}


