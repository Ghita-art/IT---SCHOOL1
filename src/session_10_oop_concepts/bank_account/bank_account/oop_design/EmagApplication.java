package session_10_oop_concepts.bank_account.bank_account.oop_design;

import java.util.ArrayList;
import java.util.List;

public class EmagApplication {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        laptop1.setBrand("Lenovo");
        laptop1.setPrice(400.35);

        Laptop laptop2 = new Laptop();
        laptop2.setBrand("Dell");
        laptop2.setPrice(420.35);

        Laptop laptop3 = new Laptop();
        laptop3.setBrand("Apple");
        laptop3.setPrice(600.35);

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);

        List<Laptop> resultLaptopList = getFilteredByLaptops(laptops, 0, 600);
        printLaptops(resultLaptopList);

    }

    public static List<Laptop> getFilteredByLaptops(List<Laptop> laptopList, double midPrice, double maxPrice) {
        List<Laptop> filteredDevices = new ArrayList<>();

        for (Laptop laptop : laptopList) {
            if (laptop.getPrice() >= midPrice && laptop.getPrice() <= maxPrice) {
                filteredDevices.add(laptop);
            }
        }
        return filteredDevices;
    }

    public static void printLaptops(List<Laptop> laptopList) {
        for (Laptop laptop : laptopList) {
            System.out.println("Brand: " + laptop.getBrand());
            System.out.println("Price: " + laptop.getPrice()+"\n");
        }
    }
}
