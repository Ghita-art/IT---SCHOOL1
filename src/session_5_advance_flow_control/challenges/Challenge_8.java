package session_5_advance_flow_control.challenges;

public class Challenge_8 {// Write a program that prints the first 10 numbers in the Fibonacci series.

    // Use a for loop to accomplish this.
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        System.out.println("First" + n + "Fibonacci Numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.println(a + "");
            int term = a;
            a = b;
            b = term + a;
        }
    }
}
