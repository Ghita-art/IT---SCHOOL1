package session_3_java_operators.practice;

public class Logical_ComplementandNegotiationOperators {
    public static void main(String[] args) {
        boolean isFirstTime = true;
        boolean isRegistered = false;

        System.out.println("Default value: " + isFirstTime);
        System.out.println("Update value: " + isFirstTime);

        System.out.println("Default value: isRegistered " + isRegistered);
        System.out.println("Update value: isRegistered" + !isRegistered);
    }
}
