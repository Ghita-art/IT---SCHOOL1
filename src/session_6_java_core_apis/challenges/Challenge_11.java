package session_6_java_core_apis.challenges;

import java.util.Scanner;

public class Challenge_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your message:");
        String message = scanner.nextLine();

        System.out.println("Enter a number to shift: (positive for encryption, negative for decryption):");
        int shift = scanner.nextInt();

        String encryptedMessage = encrypt(message, shift);
        System.out.println("Encrypted Message: " + encryptedMessage);

        String decryptedMessage = decrypt(encryptedMessage, shift);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }

    public static String encrypt(String message, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char newChar = shiftChar(c, shift, true);
                encrypted.append(newChar);
            } else {
                encrypted.append(c); // Keep non-letters unchanged
            }
        }
        return encrypted.toString();
    }

    public static String decrypt(String message, int shift) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char newChar = shiftChar(c, shift, false);
                decrypted.append(newChar);
            } else {
                decrypted.append(c); // Keep non-letters unchanged
            }
        }
        return decrypted.toString();
    }

    private static char shiftChar(char c, int shift, boolean isEncrypt) {
        int base = (Character.isUpperCase(c) ? 'A' : 'a');
        int newCharAscii = ((c - base + shift) % 26) + base;
        return (char) newCharAscii;
    }
}
