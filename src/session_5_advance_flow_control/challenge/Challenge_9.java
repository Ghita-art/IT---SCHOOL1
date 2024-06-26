package session_5_advance_flow_control.challenge;

import java.util.Scanner;

public class Challenge_9 {// Given an array of integers, write a program that prints each number in the array followed by

    // "Even" if the number is even, or "Odd" if the number is odd.
    // Utilize a for-each loop for this task.
    public static void main(String[] args) {
        int[] myArrayNo = {14, 15, 17, 18, 19, 20, 21, 22, 231, 240, 251};
        for (int number : myArrayNo) {
            String parity = (number % 2 == 0) ? "Even" : "Odd";
            System.out.println("Number" + myArrayNo + " is " + parity);
        }
        System.out.println();
    }
}
