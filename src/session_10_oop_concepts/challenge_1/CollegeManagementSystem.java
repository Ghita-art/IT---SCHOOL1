package session_10_oop_concepts.challenge_1;

import java.time.LocalDate;

public class CollegeManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFirstName("Elizaveta");
        student1.setSecondName("Marry");
        student1.setGender("F");
        student1.setPIN("6240215037761");

        System.out.println(student1.getFirstName());
        System.out.println(student1.getSecondName());
        System.out.println(student1.getGender());
        System.out.println(student1.getPIN());

        Professor professor1 = new Professor();
        professor1.setFirstName("Praetorian");
        professor1.setSecondName("Jack");
        professor1.setGender("M");
        professor1.setPIN("5240215039800");

        System.out.println(professor1.getFirstName());
        System.out.println(professor1.getSecondName());
        System.out.println(professor1.getGender());
        System.out.println(professor1.getPIN());
    }
}
