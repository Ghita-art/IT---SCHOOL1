package session_16_collections_framework.challenge.array_list;

import static session_4_java_operators_and_loops.practice.ForStatment.printArray;

public class Challenge_5 {
    public static void main(String[] args) {
        // Initialize the array
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Original array:");
        printArray(array);

        int index = 2;
        int newElement = 99;
        updateElement(array, index, newElement);
        System.out.println("Updated array:");
        printArray(array);

    }

    public static void updateElement(int[] array, int index, int newElement) {
        // Check if the index is valid
        if (index >= 0 && index < array.length) {
            array[index] = newElement;
        } else {
            System.out.println("Invalid index: " + index);
        }
    }
}
