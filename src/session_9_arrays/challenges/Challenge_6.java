package session_9_arrays.challenges;

import java.util.LinkedList;

public class Challenge_6 {
    public static void main(String[] args) {
        LinkedList<String> studentList = new LinkedList<String>();
        studentList.add("John");
        studentList.add("Jane");
        studentList.add("Bob");
        studentList.add("Mary");
        studentList.add("Jack");
        String studentToRemove = studentList.removeFirst();
        boolean remove = studentList.remove(studentToRemove);
        if (remove) {
            System.out.println("Student " + studentToRemove + " removed");
            System.out.println("Updated list" + studentList);
        } else {
            System.out.println("Student " + studentToRemove + " not in the list");
        }
    }
}
