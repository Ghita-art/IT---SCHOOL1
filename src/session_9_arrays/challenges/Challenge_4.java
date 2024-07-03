package session_9_arrays.challenges;

public class Challenge_4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 15, 14, 17, 43, 20, 13, 11, 10};
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;

            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + oddCount);
        System.out.println("Odd numbers: " + evenCount);
    }
}
