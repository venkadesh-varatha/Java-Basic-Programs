package traversal;

import java.util.ArrayList;

public class TraversalUsingForEach {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        al.forEach(x -> System.out.println(x));
    }
}
