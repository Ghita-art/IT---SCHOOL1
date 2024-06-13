package Challenges_Session_3;

public class Challenge_8 {
    // Create a program that takes two byte values, adds them together, and stores the result in a byte variable.
    public static void main(String[] args) {
        byte number1 = 10;
        byte number2 = 20;
        int sum = number1 + number2;
        byte result = (byte) sum;
        System.out.println("Sum of " + number1 + " and " + number2 + " is " + result);
    }
}
