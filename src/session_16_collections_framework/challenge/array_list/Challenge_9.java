package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge_9 {
    public static void main(String[] args) {
        // Initialize the source ArrayList
        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("Apple");
        sourceList.add("Banana");
        sourceList.add("Cherry");
        sourceList.add("Date");
        sourceList.add("Elderberry");

        System.out.println("Source ArrayList:");
        printArrayList(sourceList);

        ArrayList<String> destinationList = new ArrayList<>(sourceList.size());

        for (int i = 0; i < sourceList.size(); i++) {
            destinationList.add(null);
        }
        Collections.copy(destinationList, sourceList);
        System.out.println("Destination ArrayList after copy:");
        printArrayList(destinationList);
    }

    public static void printArrayList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

