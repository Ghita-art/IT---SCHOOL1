package session_10_oop_concepts.bank_account.bank_account.oop_design;

public class Laptop {

    private String brand;
    private String model;
    private double price;
    private int storageMemory;
    private int ramMemory;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStorageMemory() {
        return storageMemory;
    }

    public void setStorageMemory(int storageMemory) {
        this.storageMemory = storageMemory;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }
}
