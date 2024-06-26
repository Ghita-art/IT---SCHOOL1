package session_7_utility_classes.practice;
import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please ener your name: ");
        String userName = sc.nextLine();

        System.out.println("Please enter your age: ");
        int userAge = sc.nextInt();
        System.out.println("Are you a student? (true/false)" );
        boolean isStudent = sc.nextBoolean();
        sc.close();

        System.out.println("User" + userName + "age" + userAge+ "is student:" + isStudent);

    }

}
