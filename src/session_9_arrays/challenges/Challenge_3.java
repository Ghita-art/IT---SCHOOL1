package session_9_arrays.challenges;

import java.util.ArrayList;

public class Challenge_3 {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>(10);
        ArrayList<String> graduateStudentList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            studentList.add("Student " + (i + 1));
        }
        graduateStudentList.addAll(studentList);
        System.out.println("Students: ");
        for (String student : studentList) {
            System.out.println(student);
        }
        System.out.println("\nGraduated students: ");
        for (String student : graduateStudentList) {
            System.out.println(student);
        }
    }
}

