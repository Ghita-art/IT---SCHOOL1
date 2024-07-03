package session_9_arrays.challenges;

public class Challenge_8 {
    public static void main(String[] args) {
        String[] movies = {"Gladiator", "The Godfather", "The Dark Knight", "InterStellar", "Terminator"};
        String movieToFind = "The Godfather"; // Replace with the movie title to search for

        int foundIndex = linearSearch(movies, movieToFind);

        if (foundIndex != -1) {
            System.out.println("Movie '" + movieToFind + "' found at index: " + foundIndex);
        } else {
            System.out.println("Movie '" + movieToFind + "' not found in the list.");
        }
    }

    public static int linearSearch(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i; // Movie found, return its index
            }
        }
        return -1; // Movie not found
    }
}
