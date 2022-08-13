package traversal;

import java.util.ArrayList;

public class TraversalUsingGetMethod {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Welcome ");
        al.add("To the ");
        al.add("Java World");
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }
    }
}
