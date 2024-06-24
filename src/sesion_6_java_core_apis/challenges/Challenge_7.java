package sesion_6_java_core_apis.challenges;

public class Challenge_7 {
    public static String duplicateCharacterRemover(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                sb.append(c);
                seen[c] = true;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String text = "Balloon";
        String noDup = duplicateCharacterRemover(text);
        System.out.println("Original string: " + text);
        System.out.println("String without duplicates: " + noDup);
    }
}
