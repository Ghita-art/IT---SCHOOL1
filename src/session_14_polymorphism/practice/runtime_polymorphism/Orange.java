package session_14_polymorphism.practice.runtime_polymorphism;

public class Orange extends Fruit {
    @Override
    public String colour() {
        return "orange is orange";
    }

    @Override
    public String taste() {
        return "orange is sour";
    }
}
