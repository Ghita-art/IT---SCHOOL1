package session_9_arrays.challenges;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Please enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Please enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Please enter the operation (+, -, *, /.): ");
            System.out.println("+");
            System.out.println("-");
            System.out.println("*");
            System.out.println("/");
            System.out.println("Enter your choice: ");
            String choice = scanner.next();

            switch (choice) {
                case "+":
                    System.out.println("Result = " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Result = " + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Result = " + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case "/":
                    System.out.println("Result = " + num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                default:
                    System.out.println("The format is not the one we expect");
                    break;
            }

            System.out.println("Do you want to continue? (y or n)");
            String ch = scanner.next();

            if (!ch.equalsIgnoreCase("y")) {
                exit = true;
            }

        }
        System.out.println("Calculator ended.");
        scanner.close();
    }
}