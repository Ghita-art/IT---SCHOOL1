package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class Challenge_2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        System.out.println("Using for_each loop: ");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
