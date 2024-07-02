package session_9_arrays.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        boolean isListEmpty = names.isEmpty();
        System.out.println("Is list empty? " + isListEmpty);
        for (String name : names) {
            System.out.println(name + " ");
        }

        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "pineapple"));
        System.out.println(fruits.contains("orange"));
        String orangeValue = fruits.get(2);
        System.out.println("Orange value: " + orangeValue);
        for (int index = 0; index < fruits.size(); index++) {
            System.out.println(fruits.get(index) + "");
        }
    }
}
