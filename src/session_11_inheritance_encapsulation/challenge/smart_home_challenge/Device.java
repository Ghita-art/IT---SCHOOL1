package session_11_inheritance_encapsulation.challenge.smart_home_challenge;

abstract class Device {
    String name;
    String room;

    public Device(String name, String room) {
        this.name = name;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public abstract void performAction(String action);
}

class Light extends Device {
    public Light(String name, String room) {
        super(name, room);
    }

    @Override
    public void performAction(String action) {
        System.out.println("Light " + name + " in " + room + " is now " + action);
    }
}

class Thermostat extends Device {
    public Thermostat(String name, String room) {
        super(name, room);
    }

    @Override
    public void performAction(String action) {
        System.out.println("Thermostat " + name + " in " + room + " set to " + action);
    }
}


