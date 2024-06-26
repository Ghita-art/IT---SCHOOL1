package session_3_java_operators.practice;

public class NumericPromotion {
    public static void main(String[] args) {

        short e = 10;
        int f = e +5;

        long a = 1000000000L;
        //wrapper classes
        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;
        System.out.println(maxLongValue);
        System.out.println(minLongValue);
        System.out.println("Max integer value is " + maxLongValue);

        long testLongValue = 1231232142144L;

        int newIntValue = (int) testLongValue;
        System.out.println("Test long value");
        System.out.println("New int value: " + newIntValue);
    }
}
