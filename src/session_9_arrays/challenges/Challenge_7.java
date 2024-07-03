package session_9_arrays.challenges;

import java.util.ArrayList;
import java.util.Comparator;

public class Challenge_7 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Grapefruit");
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Watermelon");

        Comparator<String> fruitComparator = new Comparator<String>() {
            @Override
            public int compare(String fruit1, String fruit2) {
                int lengthComparison = fruit2.length() - fruit1.length();
                if (lengthComparison != 0) {
                    return lengthComparison;
                } else {
                    return fruit1.compareToIgnoreCase(fruit2);
                }
            }
        };
        fruits.sort(fruitComparator);
        System.out.println("Fruits sorted by length (descending) and name (alphabetical): " + fruits);
    }
}
