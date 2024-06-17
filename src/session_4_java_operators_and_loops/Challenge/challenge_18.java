package session_4_java_operators_and_loops.Challenge;

public class challenge_18 {//. Write a Java program where you declare an integer array with 5 elements.
    // Use a for loop to initialize the array such that each element is equal to its index incremented by 1.
    // Then use another for loop to decrement each element by 1.
    // Print the array before and after the decrement operation using a for-each loop.
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println("Array elements before decrement: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] --;
        }
        System.out.println("Array elements after decrement: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
