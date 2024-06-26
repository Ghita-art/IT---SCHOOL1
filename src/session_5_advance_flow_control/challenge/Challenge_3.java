package session_5_advance_flow_control.challenge;

import java.util.Scanner;

public class Challenge_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1, -2, 3, -4, 5,};
        int negativeCount = 0;
        for (int number : numbers) {
            if (number < 0) {
                negativeCount++;
                sc.close();
            }
        }
        System.out.println("Negative integers: " + negativeCount);
    }
}

