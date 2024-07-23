package session_15_oop_recap.practice.inheritance;

public class Test1 {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 2, "dog", "labrador", Size.MEDIUM);

        dog.bark();
        dog.fetch();
    }
}