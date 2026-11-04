import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("DBMS");

        arrayList.add(1, "DSA");
        System.out.println("ArrayList: " + arrayList);

        arrayList.remove("Python");
        System.out.println("After Deletion: " + arrayList);

        System.out.println("Get Element: " + arrayList.get(1));
        System.out.println("Size: " + arrayList.size());

        System.out.println("ArrayList Iteration:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("DBMS");

        linkedList.add(1, "DSA");
        System.out.println("LinkedList: " + linkedList);

        linkedList.remove("Python");
        System.out.println("After Deletion: " + linkedList);

        System.out.println("Get Element: " + linkedList.get(1));
        System.out.println("Size: " + linkedList.size());

        System.out.println("LinkedList Iteration:");
        for (String item : linkedList) {
            System.out.println(item);
        }
    }
}