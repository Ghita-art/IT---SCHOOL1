package session_3_java_operators;

public class Veriables {
    public static void main(String[] args) {

        int age; //declaration
        age = 18; //initialization

        int value = 10; //declaration & initialization

        int outerVariable = 100;
        if (outerVariable > 50) {
            int innerVariable = 200;
            System.out.println(innerVariable + outerVariable);

        }
        System.out.println(outerVariable);
    }
}
