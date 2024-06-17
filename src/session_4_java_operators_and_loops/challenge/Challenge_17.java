package session_4_java_operators_and_loops.challenge;

public class Challenge_17 {//Write a Java program that simulates a simple authentication system.

    // Declare a boolean variable hasUsername and hasPassword.
    // Set up a series of logical conditions using these two variables that will check the following conditions:
    public static void main(String[] args) {
        boolean hasUsername = true;
        boolean hasPassword = true;

        if (hasUsername && hasPassword) {
            System.out.println("You have successfully logged in!");}
        else if (!hasUsername && !hasPassword) {
                System.out.println("You have not successfully logged in!");
            } else{
                System.out.println("Passwords do not match!");
        }
    }
}




