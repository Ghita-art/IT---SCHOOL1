package session_10_oop_concepts.challenges.challenge_1;

import session_10_oop_concepts.practice.bank_account.Address;

import java.time.LocalDate;

public class Student {
    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth;
    private String PIN;
    private Address address;

    public Student(String firstName, String lastName, String gender, LocalDate dateOfBirth, String PIN, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = String.valueOf(dateOfBirth);
        this.PIN = PIN;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", PIN='" + PIN + '\'' +
                ", address=" + address +
                '}';
    }
}

