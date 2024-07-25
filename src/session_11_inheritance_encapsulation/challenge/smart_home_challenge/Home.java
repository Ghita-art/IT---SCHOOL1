package session_11_inheritance_encapsulation.challenge.smart_home_challenge;

import java.util.ArrayList;
import java.util.List;

class Home {
    List<User> users;
    List<Device> devices;

    public Home() {
        this.users = new ArrayList<>();
        this.devices = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void addDevice(Device device) {
        this.devices.add(device);
    }

    public void createAction(String sceneName, List<String> deviceActions) {
        System.out.println("Scene " + sceneName + " created with actions: " + deviceActions);
    }

    public void createAutomation(String trigger, String action) {
        System.out.println("Automation created: If " + trigger + " then " + action);
    }
}