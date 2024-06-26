package session_4_java_operators_and_loops.challenge;

import java.util.ArrayList;

public class Challenge_10 { // Write a Java program that creates two distinct ArrayList objects, listOne and listTwo.
    // Add some elements to listOne and assign listOne to listTwo.
    // Now modify listOne by adding a new element. Print both lists and observe the output.
    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<String>();
        ArrayList<String> listTwo = new ArrayList<String>();
        listOne.add("one");
        listOne.add("two");
        listOne.add("three");
        listOne.add("four");
        listOne.add("five");
        listTwo.addAll(listOne);
        listOne.add("six");
        System.out.println("The numbers of the first list are: " + listOne.size());
        System.out.println("The numbers of the second list are: " + listTwo.size());
    }
}
