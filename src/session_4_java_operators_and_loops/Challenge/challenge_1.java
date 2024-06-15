package session_4_java_operators_and_loops.Challenge;

public class challenge_1 {
    public static void main(String[] args) {
        //Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI".
        // Check and print whether they refer to the same object.
        String stringOne = "OpenAi";
        String stringTwo = "OpenAi";
       if (stringOne == stringTwo) {
           System.out.println("stringOne and stringtwo refer to the same object");
       } else { System.out.println("stringOne and stringtwo refer to a different object");
        }
    }
}

