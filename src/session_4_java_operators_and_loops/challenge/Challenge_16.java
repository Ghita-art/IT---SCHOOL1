package session_4_java_operators_and_loops.challenge;

public class Challenge_16 {//Write a Java program where you use unary operators to perform a series of transformations on an integer variable number initialized to 50.

    // First, negate number, then take the absolute value, and finally increment it by 1. Print the result at each step.
    public static void main(String[] args) {
        int number = 50;
        number = -number;
        System.out.println("The number after negation is: " + number);
        number = +number;
        System.out.println("The number after absolute value is: " + number);
        number++;
        System.out.println("The number after incrementation by 1 is: " + number);
    }
}
