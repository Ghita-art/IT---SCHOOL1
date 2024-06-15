package session_4_java_operators_and_loops.Challenge;

public class challenge_4 {
    //Write a Java program where you declare two integer variables heightOne and heightTwo with any values.
    // Use a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the result.
    public static void main(String[] args) {
        int heightOn = 180;
        int heightTwo = 173;
        int maximumHeight = (heightOn > heightTwo) ? heightOn : heightTwo;
        System.out.println("Maximum height: " + maximumHeight);
    }
}
