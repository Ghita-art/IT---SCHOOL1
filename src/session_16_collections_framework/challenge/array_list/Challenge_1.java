package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Challenge_1 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        System.out.println("List of colors: " + colors);
        System.out.println("Colors in the list:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
