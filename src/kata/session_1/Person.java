package kata.session_1;

public class Person {

    //name, age, and address
    private String firstName;
    private int age;
    private String lastName;

    public Person(String firstName,String lastName, int age) {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }
}

