package session_6_java_core_apis.challenges;

public class Challenge_8 {
    public static String insertString(String original, String toInsert, int index) {
        if (index < 0 || index > original.length()) {
            throw new IllegalArgumentException("Index out of bounds: " + index);
        }
        StringBuilder sb = new StringBuilder(original);
        sb.insert(index, toInsert);
        return sb.toString();
    }

    public static void main(String[] args) {
        String original = "Hello, ";
        String toInsert = "world";
        int insertionIndex = 7;

        String insertedString = insertString(original, toInsert, insertionIndex);
        System.out.println("Original String: " + original);
        System.out.println("String after insertion: " + insertedString);
    }
}