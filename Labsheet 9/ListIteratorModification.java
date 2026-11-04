import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorModification {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Aman");

        ListIterator<String> itr = students.listIterator();

        while (itr.hasNext()) {
            String name = itr.next();

            if (name.equals("Priya")) {
                itr.set("Anushka");
                itr.add("Sneha");
            }
        }

        System.out.println("Modified List: " + students);
    }
}