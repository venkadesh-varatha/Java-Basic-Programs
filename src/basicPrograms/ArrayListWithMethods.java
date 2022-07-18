package basicPrograms;

import java.util.ArrayList;

public class ArrayListWithMethods {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Venkadesh");
        al.add("Kanya");
        al.add("Poongodi");
        al.add("Yogamithran");
        System.out.println(al.contains("Poongodi"));
        System.out.println(al.remove("Poongodi"));
        System.out.println(al.contains("Poongodi"));
        System.out.println(al.remove("Poongodi"));
        System.out.println(al.remove(2));
        System.out.println(al);

    }
}
