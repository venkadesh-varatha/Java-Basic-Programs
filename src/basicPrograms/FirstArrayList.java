package basicPrograms;

import java.util.ArrayList;

public class FirstArrayList {
    public static void main(String[] args) {

        /*
         * 1) ArrayList is a part of Java Collection Framework and is present in java.util package.
         * 2) It provides us with DYNAMIC ARRAY in java.
         * 3) Since ArrayList is a dynamic array, we don't have to specify the size while creating it.
         * 4) Size of the ArrayList automatically increases or decrease when we dynamically add or remove items.
         * 5) ArrayList cannot be used for primitive types, like int, char, etc.
         * 6) We need a wrapper class for such cases.
         */
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);
    }
}
