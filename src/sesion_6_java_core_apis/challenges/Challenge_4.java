package sesion_6_java_core_apis.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge_4 {
    public static String removeVowels(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!isVowel(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
    public static void main(String[] args) {
        String text = "Create a Java program that uses the StringBuilder class to remove all the vowels from an input string.";
        String NoVowels = removeVowels(text);
        System.out.println("Original text: " + text);
        System.out.println("The text with no vowels:" + NoVowels);
    }
    }

