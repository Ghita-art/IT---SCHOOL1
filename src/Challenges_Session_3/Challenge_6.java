package Challenges_Session_3;

import java.util.Scanner;

public class Challenge_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater than " + secondNumber);
        }
        else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " is less than " + secondNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " is equal to " + secondNumber);
        } else {
            System.out.println(firstNumber + " is greater than " + secondNumber);
        }
    }
}
