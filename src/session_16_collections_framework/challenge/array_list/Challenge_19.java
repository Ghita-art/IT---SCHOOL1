package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Challenge_19 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        System.out.println("Original ArrayList:");
        printArrayList(list);

        list = trimArrayListCapacity(list);

        System.out.println("ArrayList after trimming capacity:");
        printArrayList(list);
    }

    public static ArrayList<String> trimArrayListCapacity(ArrayList<String> list) {
        ArrayList<String> trimmedList = new ArrayList<>(list.size());
        trimmedList.addAll(list);
        return trimmedList;
    }

    public static void printArrayList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

