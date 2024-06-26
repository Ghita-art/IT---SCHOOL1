package session_5_advance_flow_control.challenges;

import java.util.Scanner;

public class Challenge_5 { //Write a program that generates and prints the first n numbers of the Fibonacci series,
    // where n is provided by the user.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci sequence: ");
        printFibonacci(n);
        sc.close();
    }

    public static void printFibonacci(int n) {
        int nextNo;
        if (n <= 0) {
            System.out.println("Invalid number, please enter a positive number");
        } else if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(1 + "" + 1);
        } else {
            int firstNo = 1;
            int secondNo = 0;
            System.out.println(firstNo + "" + secondNo + "");
            for (int i = 3; i <= n; ++i) {
                nextNo = firstNo + secondNo;
                firstNo = nextNo;
                secondNo = nextNo;
                System.out.println(nextNo + "");
            }
        }

    }

    {
    }
}