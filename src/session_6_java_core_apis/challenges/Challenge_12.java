package session_6_java_core_apis.challenges;

public class Challenge_12 {
    public static String convert(String camelCase) {
        if (camelCase == null || camelCase.isEmpty()) {
            return camelCase;
        }

        StringBuilder snakeCase = new StringBuilder();
        snakeCase.append(Character.toLowerCase(camelCase.charAt(0)));

        for (int i = 1; i < camelCase.length(); i++) {
            char currentChar = camelCase.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                snakeCase.append('_');
                snakeCase.append(Character.toLowerCase(currentChar));
            } else {
                snakeCase.append(currentChar);
            }
        }

        return snakeCase.toString();
    }

    public static void main(String[] args) {
        String camelCaseString = "thisIsCamelCase";
        String snakeCaseString = convert(camelCaseString);
        System.out.println(camelCaseString + " in snake_case: " + snakeCaseString);
    }
}