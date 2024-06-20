package session_5_advance_flow_control.challenge;

import java.util.Scanner;

public class Challenge_4 {
    //String Reverser
    //Ask the user to enter a string. Print the reversed version of this string

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your string : ");
    String text = sc.nextLine();
        String originalStr = text;
        String reversedStr = "";
        System.out.println("Original String: " + originalStr);

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        System.out.println("Reversed string: " + reversedStr);
    }
}
