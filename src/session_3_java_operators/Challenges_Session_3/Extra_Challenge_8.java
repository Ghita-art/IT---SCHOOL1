package session_3_java_operators.Challenges_Session_3;

import java.util.Scanner;

public class Extra_Challenge_8 {
    //Comparing Product Prices
    //Write a Java program to compare the prices of two products.
    // Given the prices price1 and price2 of two products, print which product is cheaper or if they have the same price.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First product price");
        double firstPrice = sc.nextDouble();
        System.out.println("Second product price");
        double secondPrice = sc.nextDouble();
        if (firstPrice < secondPrice) {
            System.out.println("The first product price is less than the second product");
        } else if ( secondPrice < firstPrice) {
            System.out.println("The second product price is less than the first product");
        } else {
            System.out.println("The first product price is equal to the second product");
            sc.close();
        }
    }
}
