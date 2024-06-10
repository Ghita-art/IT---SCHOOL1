package session_3_java_operators;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int x = 30;
        int y = 3;
        int reminder = x % y;

        double power = Math.pow(x, y);
        System.out.println("reminder is " + reminder);
        System.out.println("power is " + power);
    }
}
