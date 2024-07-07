package session_6_java_core_apis.challenges;

public class Challenge_10 {
    private static final String[] MORSE_CODE = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.",
            "---", ".--.", "--.-", ".-.", "...", "-", "..-",
            "...-", ".--", "-..-", "-.--", "--.."};

    public static String convertToMorse(String text) {
        StringBuilder morseCode = new StringBuilder();

        for (char c : text.toUpperCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                int index = c - (Character.isDigit(c) ? '0' : 'A');
                morseCode.append(MORSE_CODE[index] + " ");
            }
        }

        return morseCode.toString().trim();
    }

    public static void main(String[] args) {
        String text = "Hello World 123";
        String morseCode = convertToMorse(text);
        System.out.println("Original Text: " + text);
        System.out.println("Morse Code: " + morseCode);
    }
}

