package session_10_oop_concepts.challenges.challenge_1;

import session_10_oop_concepts.practice.bank_account.Address;

import java.time.LocalDate;

public class Professor {

    private final String firstName;
    private final String lastName;
    private final String gender;
    private final LocalDate dateOfBirth;
    private final String PIN;
    private final Address address;

    public Professor(String firstName, String lastName, String gender, LocalDate dateOfBirth, String PIN, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.PIN = PIN;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", PIN='" + PIN + '\'' +
                ", address=" + address +
                '}';
    }
}
