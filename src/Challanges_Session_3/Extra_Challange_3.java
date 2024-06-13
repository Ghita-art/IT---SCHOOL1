package Challanges_Session_3;

import java.util.Scanner;

public class Extra_Challange_3 {
    // Banking Operations
    //Write a Java program to simulate a simple banking operation.
    // Given an initial account balance and a deposit amount deposit, calculate the new balance after the deposit.
    // Print the initial balance, deposit amount, and new balance.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your balnace:");
        double bal = sc.nextDouble();
        System.out.println("Amount you want to deposit:");
        double amount = sc.nextDouble();
        double newBlance = bal + amount;
        System.out.printf("Your blaance was %f, The deposited amount was %f, and the new balance is %f", bal, amount, newBlance);

    }
}
