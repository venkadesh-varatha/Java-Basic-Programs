package basicPrograms;

import java.util.ArrayList;

public class StringArrayList {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Venky");
        al.add("Venkadesh");
        System.out.println(al.size());
        al.add("Kanya");
        System.out.println(al);
        al.add(1, "Yoga");
        al.add("Kani");
        System.out.println(al);
    }
}
