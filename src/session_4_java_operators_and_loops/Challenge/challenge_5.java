package session_4_java_operators_and_loops.Challenge;

public class challenge_5 {
    //Write a Java program to print the numbers from 1 to 10 using a for loop.
    // As a next step, modify your program to print only the even numbers from 1 to 10.
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 2; i <= 10; i +=2) {
            System.out.println(i);
        }
    }
}
