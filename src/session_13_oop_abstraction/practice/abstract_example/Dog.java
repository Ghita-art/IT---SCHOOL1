package session_13_oop_abstraction.practice.abstract_example;

import session_13_oop_abstraction.practice.interface_example.Pet;

public class Dog extends Animal implements Pet {
    @Override
    public void poop() {
        System.out.println("this dog is pooping");
    }

    @Override
    public void makesSound() {
        System.out.println("Bark");
    }
}
