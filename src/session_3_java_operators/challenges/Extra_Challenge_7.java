package session_3_java_operators.challenges;

import java.util.Scanner;

public class Extra_Challenge_7 {//Loan Interest Calculation

    //Write a Java program to calculate the interest on a loan.
    // Given the principal amount principal, the annual interest rate, and the time period in years time,
    // calculate the simple interest using the formula Interest = (principal * rate * time) / 100. Print the interest amount.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount:");
        int Amount = sc.nextInt();
        System.out.println("Annual interest rate:");
        double AnnualInterestRate = sc.nextDouble();
        System.out.println("Enter number of years:");
        int Years = sc.nextInt();
        Double interestRate = (Amount * AnnualInterestRate * Years) / 100;
        System.out.println("Interest rate: " + interestRate);
        sc.close();
    }
}

