package session_3_java_operators.challenges_Session_3;

public class Challenge_4 {
    public static void main(String[] args) {
        //Write a Java program that uses both the increment (++) and decrement (--) operators //
        // in a loop to count up to 10 and then back down to 1.
        int count = 1;
        while (count <= 10) {
            System.out.println(count + " ");
            ++count;
        }
        System.out.println();
        while (count > 1) {
            --count;
            System.out.println(count + " ");
        }
        System.out.println();
    }
}

