package session_9_arrays.challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cityList = new ArrayList<String>();
        cityList.add("San Francisco");
        cityList.add("London");
        cityList.add("Paris");
        cityList.add("New York");
        cityList.add("Tokyo");
        System.out.println("City List: " + cityList);
        System.out.println("Enter a new city name: ");
        String cityName = sc.nextLine();
        if (cityList.contains(cityName)) {
            System.out.println("Your city is already in the city list");
        } else {
            cityList.add(cityName);
            System.out.println("Your city is added to the city list");
        }
        System.out.println("Updated city list: " + cityList);
        sc.close();
    }
}
