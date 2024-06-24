package sesion_6_java_core_apis.challenges;

import java.util.List;

public class Challenge_3 {
    public static String concatenateStrings(List<String>stringList) {
        StringBuilder sb = new StringBuilder();
        for (String str : stringList) {
            sb.append(str);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        List<String> stringList = List.of("Hello", ",","World","!", "My", " name", " is", " Ghita",".");
        String combinedString = concatenateStrings(stringList);
        System.out.println("Combined String: " + combinedString);
    }
}
