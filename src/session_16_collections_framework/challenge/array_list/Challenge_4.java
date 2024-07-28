package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Challenge_4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Black");
        colors.add("White");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Purple");
        System.out.println("Color list" + colors);

        int index = 5;
        if (index >= 0 && index < colors.size()) {
            String color = colors.get(index);
            System.out.println("Element at index " + index + ":" + color);
        } else {
            System.out.println("Index out of bound");
        }
    }
}
