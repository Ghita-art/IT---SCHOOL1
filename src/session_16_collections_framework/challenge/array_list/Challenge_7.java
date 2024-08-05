package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.Scanner;

import static session_16_collections_framework.challenge.array_list.Challenge_6.printArrayList;

public class Challenge_7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Print the original ArrayList
        System.out.println("ArrayList:");
        printArrayList(list);

        // Get the element to search from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        String elementToSearch = scanner.nextLine();

        // Search for the element
        int index = searchElement(list, elementToSearch);

        // Display the result
        if (index != -1) {
            System.out.println("Element '" + elementToSearch + "' found at index: " + index);
        } else {
            System.out.println("Element '" + elementToSearch + "' not found in the ArrayList.");
        }

        scanner.close();
    }

    public static int searchElement(ArrayList<String> list, String element) {
        return list.indexOf(element);
    }
}

