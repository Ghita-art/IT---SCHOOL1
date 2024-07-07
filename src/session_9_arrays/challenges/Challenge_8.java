package session_9_arrays.challenges;

import java.util.Scanner;

public class Challenge_8 {
    public static void main(String[] args) {
        String[] movieNames = {"Titanic", "Avengers", "Gladiator", "The Godfather", "The Dark Knight", "InterStellar", "Terminator" };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a movie name : ");
        String movieName = scanner.nextLine();
        int position = linearSearch(movieNames, movieName);
        if (position != -1) {
            System.out.println("Movie found at index position: " + position);

        }else{
            System.out.println("Movie not found");
        }
        scanner.close();
    }
    public static int linearSearch(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
