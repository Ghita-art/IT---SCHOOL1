package Challenges_Session_3;

import java.util.Scanner;

public class Extra_Challenge_5 {
    //Grocery Store Discounts
    //Write a Java program to apply a discount to a grocery bill.
    // Given the original bill amount originalBill and a discount percentage discountPercent,
    // calculate and print the final bill amount after applying the discount.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your grocery bill before discount");
        double bill = sc.nextDouble();

        System.out.println("Enter the percent discount:");
        double percent = sc.nextDouble();

        double total = bill - (bill * percent /100 );
        System.out.println("Your grocery bill after discount:"+ total);
    }
}

