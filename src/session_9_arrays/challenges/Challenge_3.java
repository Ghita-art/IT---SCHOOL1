package session_9_arrays.challenges;

import java.util.ArrayList;

public class Challenge_3 {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<String>(10);
        ArrayList<String> graduateStudentList = new ArrayList<String>(10);
        for (int i = 0; i < 10; i++) {
            studentList.add("Student" + (i + 1));

        }
        graduateStudentList.addAll(studentList);
        System.out.println("Graduate Students: ");
        for (String graduate : graduateStudentList) {
            System.out.println(graduate);
        }
    }
}

