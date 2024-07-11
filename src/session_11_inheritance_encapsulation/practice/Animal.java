package session_11_inheritance_encapsulation.practice;

public class Animal {

    void eat() {
        System.out.println("The animal is eating");
    }
}

class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("The dog is eating");

    }
}

class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}