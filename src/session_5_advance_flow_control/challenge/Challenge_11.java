package session_5_advance_flow_control.challenge;

import java.util.Scanner;

public class Challenge_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        System.out.println("Enter numbers (0 to stop): ");
        while (true) {
            double number = sc.nextDouble();
            if (number == 0) {
                break;
            }
            sum += number;
            count++;
        }
        if (count > 0) {
            double average = sum / count;
            System.out.println("Average is " + average);
        } else {
            System.out.println("No matches found");
            sc.close();
        }
    }
}
