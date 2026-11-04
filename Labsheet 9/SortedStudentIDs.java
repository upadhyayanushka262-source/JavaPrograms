import java.util.TreeSet;

public class SortedStudentIDs {
    public static void main(String[] args) {
        TreeSet<Integer> ids = new TreeSet<>();

        ids.add(105);
        ids.add(102);
        ids.add(108);
        ids.add(101);
        ids.add(105);
        ids.add(104);

        System.out.println("Student IDs: " + ids);

        System.out.println("First ID: " + ids.first());
        System.out.println("Last ID: " + ids.last());
        System.out.println("Higher than 104: " + ids.higher(104));
        System.out.println("Lower than 104: " + ids.lower(104));
    }
}
