package session_4_java_operators_and_loops.challenge;

public class Challenge_2 {
    //Write a Java program to declare two integer variables firstNumber and secondNumber with any values.
    // Use an equality operator to compare these two numbers and print the result.
    // Do the same for two String objects firstString and secondString with the same value, but use the equals() method for comparison.
    // Print the result.
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        if (firstNumber == secondNumber) {
            System.out.println("First number is equal to second number");
        } else {
            System.out.println("The Second number is not equal to the first number");
            String stringOne = "10";
            String stringTwo = "10";
            if (stringOne.equals(stringTwo)) {
                System.out.println("The first number is equal to the second number");
            } else {
                System.out.println("The first number is not equal to the second number");
            }
        }
    }
}


