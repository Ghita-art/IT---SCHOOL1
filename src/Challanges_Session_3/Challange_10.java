package Challanges_Session_3;

import java.util.Scanner;

public class Challange_10 {
    //Write a program that reverses the sign of an entered integer using unary minus operator.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to revers! : ");
        int number = sc.nextInt();
        int reverse = -number;
        System.out.println(number);
        System.out.println(reverse);
    }
}
