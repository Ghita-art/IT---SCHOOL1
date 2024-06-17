package session_4_java_operators_and_loops.Challenge;

import java.util.Scanner;

public class challenge_20 {//Write a Java program that takes three integer variables a, b, and c as input.
    // Use nested ternary operators to find and print the largest number among the three.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        int largest = (a >= b) ? (a >= c ? a : c) : (b >= c ? b : c);
        System.out.println("The largest number is " + largest);
        sc.close();
    }
}
