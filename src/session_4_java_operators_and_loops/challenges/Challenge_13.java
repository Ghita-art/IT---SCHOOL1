package session_4_java_operators_and_loops.challenges;

public class Challenge_13 {//Write a Java program where you declare two boolean variables isRaining and isSunny with values of true and false, respectively.

    // Use the logical complement operator to negate the values of both variables and print the new values.
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isSunny = false;
        boolean notRaining = !isRaining;
        boolean notsunny = !isSunny;
        System.out.println("Original isRaining: " + isRaining);
        System.out.println("Not Raining isSunny: " + notRaining);
        System.out.println("Original isSunny:  " + isSunny);
        System.out.println("Not Sunny isRaining: " + notsunny);
    }
}
