package session_7_utility_classes.challenges;

import java.time.LocalTime;

public class challenge_6 {
    public static void main(String[] args) {
        displayCurentTime();
    }

    public static void displayCurentTime() {
        LocalTime time = LocalTime.now();
        System.out.println("Current time is: " + time);
    }
}
