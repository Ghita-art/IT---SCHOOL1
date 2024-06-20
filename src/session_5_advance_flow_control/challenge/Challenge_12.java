package session_5_advance_flow_control.challenge;

import java.util.Scanner;

public class Challenge_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i=0; i< 10; i++) {
            System.out.println("Enter number " + (i + 1) + " ");
            int number = sc.nextInt();
            if (number <= 5) {
                continue;
            }
            sum += number;
        }if (sum > 0) {
            System.out.println("The sum of numbers grater than 5 is:  " + sum);
        }else {System.out.println("No number entered were grater than 5");
        }
    }
}
