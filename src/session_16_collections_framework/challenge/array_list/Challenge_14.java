package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge_14 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        System.out.println("Original ArrayList:");
        printArrayList(list);

        int index1 = 1; // Banana
        int index2 = 3; // Date

        swapElements(list, index1, index2);

        System.out.println("ArrayList after swapping elements at index " + index1 + " and " + index2 + ":");
        printArrayList(list);
    }

    public static void swapElements(ArrayList<String> list, int index1, int index2) {
        Collections.swap(list, index1, index2);
    }

    public static void printArrayList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

