package session_9_arrays.challenges;

public class Challenge_9 {
    public static void main(String[] args) {
        String binaryString = "1011";

        try {
            // Convert binary string to integer using parseInt with base 2
            int decimalValue = Integer.parseInt(binaryString, 2);
            System.out.println("The decimal representation of binary number '" + binaryString + "' is: " + decimalValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary string: " + binaryString);
        }
    }
}

