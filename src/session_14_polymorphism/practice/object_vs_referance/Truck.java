package session_14_polymorphism.practice.object_vs_referance;

public class Truck extends Vehicle{
    @Override
    public String fuelType() {
        return "The truck runs on diesel";
    }
}
