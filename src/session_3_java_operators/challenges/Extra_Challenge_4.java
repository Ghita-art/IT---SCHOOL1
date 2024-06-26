package session_3_java_operators.challenges;

import java.util.Scanner;

public class Extra_Challenge_4 {
    //Student Grade Check
    //Write a Java program to check if a student has passed or failed an exam.
    // Given the student's score, if the score is 50 or above, print "Passed", otherwise print "Failed".
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student grade:");
        int grade = sc.nextInt();
        if (grade >= 50) {
            System.out.println("Pass");
        } else if (grade < 50) {
            System.out.println("Fail");
        }
    }
}
