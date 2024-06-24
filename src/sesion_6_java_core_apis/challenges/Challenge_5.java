package sesion_6_java_core_apis.challenges;

public class Challenge_5 {
    public static String capitalizeWords(String sentence) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true;
        for (char c : sentence.toCharArray()) {
            if(Character.isLetter(c)) {
                sb.append(capitalizeNext?Character.toUpperCase(c) : c);
                capitalizeNext = false;
            }else {
                sb.append(c);
                capitalizeNext = true;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String text = "the sample of the sentence. ";
        String capitalizedSentence = capitalizeWords(text);
        System.out.println("Original sentence: " + text);
        System.out.println("Capitalized sentence: " + capitalizedSentence);
    }
}
