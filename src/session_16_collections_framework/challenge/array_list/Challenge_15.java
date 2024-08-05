package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Challenge_15 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");

        System.out.println("ArrayList 1:");
        printArrayList(list1);
        System.out.println("ArrayList 2:");
        printArrayList(list2);

        ArrayList<String> joinedList = joinArrayLists(list1, list2);

        System.out.println("Joined ArrayList:");
        printArrayList(joinedList);
    }

    public static ArrayList<String> joinArrayLists(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    public static void printArrayList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

