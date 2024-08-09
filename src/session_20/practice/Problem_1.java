package session_20.practice;

public class Problem_1 {public static void main(String[] args) {
    String sentence = "Welcome all of junior java developers!";
    String[] words = sentence.split(" ");
    int count = 0;
    for (String word : words) {
        if (word.length() > 3) {
            count++;
        }
    }

    System.out.println(count);
}
}
