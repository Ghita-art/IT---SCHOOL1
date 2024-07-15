package session_11_inheritance_encapsulation.challenge.vehicle.single_inheritance;

public class TestBike {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setSpeed(40);
        System.out.println("Current speed " + bicycle.getSpeed());
        System.out.println("Change gear " + bicycle.changeGear());

        bicycle.applyBrake(30);
        System.out.println("Current speed " + bicycle.getSpeed());
        System.out.println("Change gear " + bicycle.changeGear());

        bicycle.speedUp(20);
        System.out.println("Current speed " + bicycle.getSpeed());
        System.out.println("Change gear " + bicycle.changeGear());

        MountainBike mountainBike = new MountainBike();
        mountainBike.setSpeed(10);
        mountainBike.setSuspension("Off Road ");
        System.out.println("Current speed " + mountainBike.getSpeed());
        System.out.println("Change gear " + mountainBike.changeGear());
        System.out.println("On this " + mountainBike.getSuspension() + "the suspension is " + mountainBike.adjustSuspension(mountainBike.getSuspension()));
    }
}
