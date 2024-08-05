package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Challenge_16 {
    public static void main(String[] args) {
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        originalList.add("Date");
        originalList.add("Elderberry");

        System.out.println("Original ArrayList:");
        printArrayList(originalList);

        ArrayList<String> clonedList = cloneArrayList(originalList);

        System.out.println("Cloned ArrayList:");
        printArrayList(clonedList);

        clonedList.add("Fig");

        System.out.println("Original ArrayList after modifying cloned list:");
        printArrayList(originalList);
        System.out.println("Cloned ArrayList after modification:");
        printArrayList(clonedList);
    }

    public static ArrayList<String> cloneArrayList(ArrayList<String> list) {
        return new ArrayList<>(list);
    }

    public static void printArrayList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

