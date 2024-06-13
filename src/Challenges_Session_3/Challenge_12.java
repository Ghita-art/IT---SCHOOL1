package Challenges_Session_3;

import java.util.Scanner;

public class Challenge_12 {
    //Create a program that takes an integer as input and then increments and decrements it by 1,
    // displaying the output at each stage.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int number = sc.nextInt();

        System.out.println("Your number before incrementation " + number);
        ++number;
        System.out.println("Your number after the incrementation by 1: " + number);

        System.out.println("Your number is before decrementation " + number);
        --number;
        System.out.println("Your number after the decrementation by 1: " + number);
        sc.close();

    }
}
