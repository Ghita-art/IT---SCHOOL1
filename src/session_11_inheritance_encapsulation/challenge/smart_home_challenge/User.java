package session_11_inheritance_encapsulation.challenge.smart_home_challenge;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    String role;
    List<Device> accessibleDevices;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
        this.accessibleDevices = new ArrayList<>();
    }

    public void addAccessibleDevice(Device device) {
        this.accessibleDevices.add(device);
    }

    public void controlDevice(String deviceName, String action) {
        for (Device device : accessibleDevices) {
            if (device.getName().equals(deviceName)) {
                device.performAction(action);
                return;
            }
        }
        System.out.println("Device not accessible for this user.");
    }
}
