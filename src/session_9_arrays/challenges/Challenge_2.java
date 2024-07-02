package session_9_arrays.challenges;

import java.util.ArrayList;

public class Challenge_2 {
    public static void main(String[] args) {
        ArrayList<String> christmasWishList = new ArrayList<String>();
        christmasWishList.add("Gaming console.");
        christmasWishList.add("New keyboard.");
        christmasWishList.add("New mouse.");
        christmasWishList.add("Jordan sneakers.");
        christmasWishList.add("New smartphone.");
        System.out.println("My christmas wish list: ");
        for (String item : christmasWishList) {
            System.out.println(item);
        }
    }
}
