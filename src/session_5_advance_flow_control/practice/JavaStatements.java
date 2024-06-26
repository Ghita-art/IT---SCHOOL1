package session_5_advance_flow_control.practice;

public class JavaStatements {
    public static final int MAX_VALUE = 10;
    public static final int INT = 5;
    public static final int MAX_STRING_LENGHT = 5;

    public static void main(String[] args) {
        int number = 5;
        if (number > MAX_VALUE) {
            System.out.println("The number is greater than " + MAX_VALUE);
        }else { System.out.println("The number is less than " + MAX_VALUE);
        }
        String greeting = "Hello World";
        if (greeting.length() > MAX_STRING_LENGHT) {
            System.out.println("String is too long ");
        } else if (greeting.equals("Hello World")) {
            System.out.println("Hello World");
        } else {
            System.out.println("Unknown greeting");
        }
    }
}
