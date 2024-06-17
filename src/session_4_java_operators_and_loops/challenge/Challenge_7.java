package session_4_java_operators_and_loops.challenge;

public class Challenge_7 {
    //Write a Java program that determines the type of a triangle based on its sides.
    // Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle.
    // Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".
    public static void main(String[] args) {
        int sideOne = 10;
        int sideTwo = 10;
        int sideThree = 30;
        String tiangleType = (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral":
                             ( sideOne == sideTwo|| sideTwo == sideThree || sideOne == sideThree) ? "Isosceles" : "Scalene";
        System.out.println("Triangle Type: " + tiangleType);
    }
}
