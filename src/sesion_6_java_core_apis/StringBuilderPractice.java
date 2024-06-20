package sesion_6_java_core_apis;

public class StringBuilderPractice {
    public static void main(String[] args) {
        String result = "";
        for (int i = 0; i < 10; i++) {
            result += "a";

        }
        System.out.println("With String:" +result);
        StringBuilder sb  = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append("a");
        }
        String result2 = sb.toString();
        System.out.println("With StringBuilder:" +result2);
    }
}
