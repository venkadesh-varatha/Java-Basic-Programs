package basicPrograms;

import java.util.ArrayList;

public class ArrayListWithMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(10);
        al.add(40);
        System.out.println(al.get(1));
        al.set(1, 25);
        System.out.println(al.get(1));
        System.out.println(al.indexOf(10));
        System.out.println(al.lastIndexOf(10));
        System.out.println(al.indexOf(50));
        System.out.println(al.lastIndexOf(50));
        System.out.println(al.isEmpty());
        al.clear();
        System.out.println(al.isEmpty());
    }
}
