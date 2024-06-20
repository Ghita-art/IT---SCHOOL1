package session_5_advance_flow_control.challenge;

import java.util.Scanner;

public class Challenge_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int choice;
        System.out.println("Welcome!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Print \"Hello World\"");
            System.out.println("2. Print Name");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello World!");
                    break;
                    case 2:
                        System.out.println("Enter your name: ");
                        name = sc.next();
                        sc.nextLine();
                        System.out.println("Hello " + name + "!");
                        break;
                        case 3:
                            System.out.println("Exiting program...");
                            System.exit(0);
                        default:
                            System.out.println("Invalid choice!");
            }
        }
    }
}
