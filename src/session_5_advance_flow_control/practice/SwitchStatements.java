package session_5_advance_flow_control.practice;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        char grade = 'A';
        printGrade(grade);
    }

    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    private static void printDayOfWeek() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7 for the day of the week");
        int day = sc.nextInt();
        sc.close();

        switch (day) {
            case MONDAY:
                System.out.println("You have entered monday");
                break;
            case TUESDAY:
                System.out.println("You have entered tuesday");
                break;
            case WEDNESDAY:
                System.out.println("You have entered wednesday");
                break;
            case THURSDAY:
                System.out.println("You have entered thursday");
                break;
            case FRIDAY:
                System.out.println("You have entered friday");
                break;
            case SATURDAY:
                System.out.println("You have entered saturday");
                break;
            case SUNDAY:
                System.out.println("You have entered sunday");
                break;
        }

    }

    private static void printSeason() {
        String season = "Winter";
        switch (season) {
            case "Winter":
                System.out.println("It's cold");
                break;
            case "Spring":
                season = "Flowers bloom";
                break;
            case "Summer":
                System.out.println("It's hot");
                break;
            case "Autumn":
                System.out.println("Leaves fall");
                break;
            default:
                System.out.println("Season unknown");
        }
    }

    public static void printGrade(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good!");
                break;
            case 'C':
                System.out.println("Poor!");
                break;
            default:
                System.out.println("The grade is unknown!");
        }
    }
}


