package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

import static session_16_collections_framework.challenge.array_list.Challenge_6.printArrayList;

public class Challenge_13 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Date");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");
        list2.add("Date");

        System.out.println("ArrayList 1:");
        printArrayList(list1);
        System.out.println("ArrayList 2:");
        printArrayList(list2);

        boolean areEqual = compareArrayLists(list1, list2);

        if (areEqual) {
            System.out.println("The two ArrayLists are equal.");
        } else {
            System.out.println("The two ArrayLists are not equal.");
        }
    }

    public static boolean compareArrayLists(ArrayList<String> list1, ArrayList<String> list2) {
        return list1.equals(list2);
    }

    public static void printArrayList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
