package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Challenge_17 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        System.out.println("Original ArrayList:");
        printArrayList(list);

        emptyArrayList(list);

        System.out.println("ArrayList after emptying:");
        printArrayList(list);
    }

    public static void emptyArrayList(ArrayList<String> list) {
        list.clear();
    }

    public static void printArrayList(ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            for (String element : list) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

