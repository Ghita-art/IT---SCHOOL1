package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Challenge_20 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Original ArrayList:");
        printArrayList(list);

        System.out.println("Initial capacity: " + getArrayListCapacity(list));

        int newCapacity = 10;
        increaseArrayListCapacity(list, newCapacity);

        System.out.println("ArrayList after increasing capacity:");
        printArrayList(list);

        System.out.println("New capacity: " + getArrayListCapacity(list));
    }

    public static void increaseArrayListCapacity(ArrayList<String> list, int minCapacity) {
        list.ensureCapacity(minCapacity);
    }

    public static int getArrayListCapacity(ArrayList<String> list) {
        try {
            java.lang.reflect.Field field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true);
            Object[] data = (Object[]) field.get(list);
            return data.length;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static void printArrayList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

