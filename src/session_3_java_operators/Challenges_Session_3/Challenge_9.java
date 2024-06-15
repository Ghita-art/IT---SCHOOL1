package session_3_java_operators.Challenges_Session_3;

import java.util.Scanner;

public class Challenge_9 {
    //Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double length = sc.nextDouble();
        System.out.println("Enter the second number : ");
        double breadth = sc.nextDouble();
        double area = length*breadth;
        System.out.println("The area of the rectangle is : "+area);
        sc.close();
    }
}
