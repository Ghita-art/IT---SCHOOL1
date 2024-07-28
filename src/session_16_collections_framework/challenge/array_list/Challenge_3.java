package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Challenge_3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println("Original color list: " +colors);

        colors.add(0,"Orange");

        System.out.println("Updated list after adding 'Orange': " +colors);
    }

}
