package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Challenge_6 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");

        System.out.println("Original ArrayList:");
        printArrayList(list);
        removeThirdElement(list);

        System.out.println("Updated ArrayList:");
        printArrayList(list);
    }

    public static void removeThirdElement(ArrayList<String> list) {
        int indexToRemove = 2;
        if (list.size() > indexToRemove) {
            list.remove(indexToRemove);
        } else {
            System.out.println("The list does not have a third element to remove.");
        }
    }

    public static void printArrayList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}


