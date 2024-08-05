package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Challenge_18 {
    public static void main(String[] args) {
        ArrayList<String> listWithElements = new ArrayList<>();
        listWithElements.add("Apple");
        listWithElements.add("Banana");
        listWithElements.add("Cherry");

        ArrayList<String> emptyList = new ArrayList<>();

        System.out.println("Is the list with elements empty? " + isArrayListEmpty(listWithElements));
        System.out.println("Is the empty list empty? " + isArrayListEmpty(emptyList));
    }

    public static boolean isArrayListEmpty(ArrayList<String> list) {
        return list.isEmpty();
    }
}

