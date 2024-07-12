package session_10_oop_concepts.challenges.challenge_1;

import session_10_oop_concepts.practice.bank_account.Address;

public class Student {
    private String firstName;
    private String secondName;
    private String gender;
    private String dateOfBirth;
    private String PIN;
    private Address address;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
        this.firstName = getFirstName();
        this.secondName = getSecondName();
        this.age = getAge();
        this.gender = getGender();
        this.dateOfBirth = getDateOfBirth();
        this.PIN = getPIN();

    }
}