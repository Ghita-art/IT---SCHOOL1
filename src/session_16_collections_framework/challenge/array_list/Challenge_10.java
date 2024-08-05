package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.Collections;

import static session_16_collections_framework.challenge.array_list.Challenge_6.printArrayList;

public class Challenge_10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        System.out.println("Original ArrayList:");
        printArrayList(list);

        shuffleArrayList(list);

        System.out.println("Shuffled ArrayList:");
        printArrayList(list);
    }

    public static void shuffleArrayList(ArrayList<String> list) {
        Collections.shuffle(list);
    }
}
