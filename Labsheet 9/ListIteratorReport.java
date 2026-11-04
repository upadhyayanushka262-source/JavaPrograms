import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorReport {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("DBMS");
        courses.add("DSA");
        courses.add("Networking");

        ListIterator<String> itr = courses.listIterator();

        System.out.println("Forward Traversal:");

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Next Index: " + itr.nextIndex());
        System.out.println("Previous Index: " + itr.previousIndex());

        System.out.println("Backward Traversal:");

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}