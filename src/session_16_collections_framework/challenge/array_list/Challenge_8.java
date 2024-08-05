package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.Collections;

import static session_16_collections_framework.challenge.array_list.Challenge_6.printArrayList;

public class Challenge_8 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Elderberry");
        list.add("Cherry");
        list.add("Date");

        System.out.println("Original ArrayList:");
        printArrayList(list);

        sortArrayList(list);

        System.out.println("Sorted ArrayList:");
        printArrayList(list);
    }

    public static void sortArrayList(ArrayList<String> list) {
        Collections.sort(list);
    }
}
