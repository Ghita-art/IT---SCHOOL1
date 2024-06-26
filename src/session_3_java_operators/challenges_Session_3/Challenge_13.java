package session_3_java_operators.challenges_Session_3;

import java.util.Scanner;

public class Challenge_13 {
    //Write a program to calculate the price after discount.
    // Take the original price and discount percentage as input.
    // Use compound assignment operator to perform the calculation.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the price: ");
        double price = sc.nextDouble();
        System.out.println("Please, enter de discount: ");
        double discount = sc.nextDouble();
        double myPriceAfterDiscount = price - ((price * discount) / 100);
        System.out.println("The price after discount is: " + myPriceAfterDiscount);
        sc.close();
    }
}

