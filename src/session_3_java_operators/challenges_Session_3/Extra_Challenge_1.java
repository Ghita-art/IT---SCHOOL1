package session_3_java_operators.challenges_Session_3;

public class Extra_Challenge_1 {
    // Calculating Shopping Expenses
    //Write a Java program to calculate the total cost and change you get back when buying items.
    // Given the price of an item price and the quantity quantity, calculate the total cost.
    // Assume you paid with a bill of 100. Print the total cost and the change you receive.
    public static void main(String[] args) {
        double price = 14.5;
        int itemsNo = 2;
        double totalCost = price * itemsNo;
        double totalChange = 100 - totalCost;
        System.out.println("Total cost" + totalCost);
        System.out.println("Total change" + totalChange);
        System.out.printf("Total cost if %f and the change is %f.", totalCost, totalChange);
    }
}
