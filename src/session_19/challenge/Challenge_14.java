package session_19.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Challenge_14 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.00),
                new Product("Phone", "Electronics", 800.00),
                new Product("Headphones", "Electronics", 200.00),
                new Product("Shirt", "Clothing", 50.00),
                new Product("Jeans", "Clothing", 60.00),
                new Product("Jacket", "Clothing", 100.00),
                new Product("Blender", "Appliances", 150.00),
                new Product("Toaster", "Appliances", 30.00)
        );

        Map<String, Double> categoryAveragePrice = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));

        Optional<Map.Entry<String, Double>> highestAveragePriceCategory = categoryAveragePrice.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        highestAveragePriceCategory.ifPresent(category ->
                System.out.println("Category with the highest average price: " + category.getKey() +
                        " with average price: " + category.getValue()));

    }
}
