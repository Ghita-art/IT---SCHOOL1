package session_19.challenge;

public class Product {

        String name;
        String category;
        double price;

        Product(String name, String category, double price) {
            this.name = name;
            this.category = category;
            this.price = price;
        }
        public String getCategory(){
            return category;
        }
        public double getPrice(){
            return price;
        }
    }

