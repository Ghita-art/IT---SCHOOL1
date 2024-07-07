package session_6_java_core_apis.challenges;

public class Challenge_9 {
    public static void main(String[] args) {
        String str = "Mississippi";
        int[] charCounts = new int[256];
        for (char c : str.toCharArray()) {
            charCounts[c]++;
        }
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) {
                char ch = (char) i;
                System.out.println("Character'" + ch + "'occurred " + charCounts[i] + " times");
            }
        }
    }
}
