package session_9_arrays.challenges;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Challenge_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operator;
        do {
            num1 = getDouble(scanner, "Enter first number: ");
            num2 = getDouble(scanner, "Enter second number: ");
            operator = getChar(scanner, "Enter an operator (+, -, *, /): ");
            double result = calculate(num1, num2, operator);
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
            System.out.print("Do you want to perform another calculation? (y/n): ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));

        System.out.println("Exiting calculator...");
        scanner.close();
    }

    public static double getDouble(Scanner scanner, String message) {
        double number;
        do {
            System.out.print(message);
            try {
                number = scanner.nextDouble();
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the scanner buffer
            }
        } while (true);
    }

    // Function to get a character from the user with input validation
    public static char getChar(Scanner scanner, String message) {
        char operator;
        do {
            System.out.print(message);
            String input = scanner.nextLine();
            if (input.length() != 1 || !"+-*/".contains(input)) {
                System.out.println("Invalid operator. Please enter +, -, *, or /.");
            } else {
                operator = input.charAt(0);
                return operator;
            }
        } while (true);
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
