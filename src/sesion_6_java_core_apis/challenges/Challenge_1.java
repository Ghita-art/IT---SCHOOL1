package sesion_6_java_core_apis.challenges;

public class Challenge_1 {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String input = "Hello World";
        String reversed = reverse(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}




