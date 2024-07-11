package session_11_inheritance_encapsulation.practice;

public class Vehicle {
    private String brand;
    private int speed;


    public void acceleration() {
        speed += 10;

    }

    public void brake() {
        speed -= 10;
    }
}

class car extends Vehicle {
    @Override
    public void acceleration() {
        super.acceleration();
    }
}

class Bike extends Vehicle {
    @Override
    public void acceleration() {
        super.acceleration();
    }
}