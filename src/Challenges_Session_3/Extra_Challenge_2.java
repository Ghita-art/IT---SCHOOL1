package Challenges_Session_3;

import java.util.Scanner;

public class Extra_Challenge_2 {
    //Temperature Conversion
    //Write a Java program to convert a temperature from Celsius to Fahrenheit. Use the formula F = (C * 9/5) + 32.
    // Given a temperature in Celsius celsius, calculate and print the temperature in Fahrenheit.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the temperature in Celsius");
        double Celsius = sc.nextDouble();

        double Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + Fahrenheit);
    }
}
