package sesion_6_java_core_apis.challenges;

public class Challenge_6 {
    public static String replaceWords(String str, String from, String to) {
        StringBuilder sb=new StringBuilder(str);
        int start=0;
        while ((start = sb.indexOf(from , start)) !=-1) {
            sb.replace(start, start + from.length(), to);
            start += to.length();
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String text = "The cat sat on the mat. ";
        String replacement = replaceWords(text, "cat", "dog");
        System.out.println("Original text: " + text);
        System.out.println("Replaced text: " + replacement);
    }
}
