package session_9_arrays.challenges;

import java.util.ArrayList;

public class Challenge_1 {
    public static void main(String[] args) {

        String[] shoppingList = new String[5];


        shoppingList[0] = "Milk";
        shoppingList[1] = "Bread";
        shoppingList[2] = "Eggs";
        shoppingList[3] = "Apples";


        System.out.println("Shopping List:");
        for (int i = 0; i < shoppingList.length; i++) {
            if (shoppingList[i] != null) {
                System.out.println(shoppingList[i]);
            }
        }
    }
}
