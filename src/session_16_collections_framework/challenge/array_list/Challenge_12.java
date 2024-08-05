package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Challenge_12 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");

        System.out.println("Original ArrayList:");
        printArrayList(list);

        int start = 2;
        int end = 5;

        List<String> subList = extractPortion(list, start, end);

        System.out.println("Extracted portion of ArrayList:");
        printArrayList(subList);
    }

    public static List<String> extractPortion(ArrayList<String> list, int start, int end) {
        return list.subList(start, end);
    }

    public static void printArrayList(List<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

