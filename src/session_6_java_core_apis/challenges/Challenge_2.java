package session_6_java_core_apis.challenges;

public class Challenge_2 {
    public static boolean isPolindrome(String str){
        StringBuilder reverse = new StringBuilder(str).reverse();
        return str.equals(reverse.toString());
    }
    public static void main(String[] args) {
        String text = "racecar";
        boolean isPolindrome = isPolindrome(text);
        System.out.println(text +" is polindrome: " + isPolindrome);
        text = "racecar";
        isPolindrome = isPolindrome(text);
        System.out.println(text +" is polindrome: " + isPolindrome);
    }
}
