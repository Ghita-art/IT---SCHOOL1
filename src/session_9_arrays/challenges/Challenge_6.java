package session_9_arrays.challenges;

import java.util.LinkedList;
import java.util.Scanner;

public class Challenge_6 {
    public static void main(String[] args) {
        LinkedList<String> studentList = new LinkedList<String>();
        studentList.add("John");
        studentList.add("Jane");
        studentList.add("Bob");
        studentList.add("Mary");
        studentList.add("Jack");
        System.out.println("Students list ");
        for (String student : studentList) {
            System.out.println(student);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student you want to remove: ");
        String studentToRemove = scanner.nextLine();
        boolean remove = studentList.remove(studentToRemove);
        if (remove) {
            System.out.println("Student " + studentToRemove + " was removed");
            System.out.println("Updated list" + studentList);
        } else {
            System.out.println("Student " + studentToRemove + " not in the list");
            scanner.close();
        }
    }
}
