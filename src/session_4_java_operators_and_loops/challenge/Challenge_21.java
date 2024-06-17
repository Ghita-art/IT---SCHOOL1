package session_4_java_operators_and_loops.challenge;

import java.util.Scanner;

public class Challenge_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's score (0-100): ");
        double score = sc.nextDouble();
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        System.out.println("Your score is " + grade + ".");
        sc.close();
    }
}
