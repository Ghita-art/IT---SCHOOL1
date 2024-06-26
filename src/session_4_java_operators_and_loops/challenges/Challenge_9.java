package session_4_java_operators_and_loops.challenges;

public class Challenge_9 {
    //Write a Java program to create two String variables, countryOne with the value "USA" and countryTwo with the value "USA".
    // Check if countryOne and countryTwo are equal using the equals() method and print the result.
    // Then change the value of countryTwo to "UK" and check for equality again. Print the result.
    public static void main(String[] args) {
        String countryOne = "USA";
        String countryTwo = "USA";
        if (countryOne.equals(countryTwo)) {
            System.out.println("The country is the same");
        } else {
            System.out.println("The country is not the same");
        }
    }
}