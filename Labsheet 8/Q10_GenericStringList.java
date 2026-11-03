import java.util.*;

public class Q10_GenericStringList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Aman");
        names.add("Riya");
        names.add("Rahul");
        names.add("Neha");
        names.add("Anu");

        System.out.println("Original List: " + names);

        System.out.println("Get: " + names.get(1));

        names.set(1, "Priya");
        System.out.println("After Set: " + names);

        names.remove("Rahul");
        System.out.println("After Remove: " + names);

        System.out.println("Size: " + names.size());
    }
}