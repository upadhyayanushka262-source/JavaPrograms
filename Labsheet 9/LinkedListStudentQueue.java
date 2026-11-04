import java.util.LinkedList;

public class LinkedListStudentQueue {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.addFirst("Rahul");
        students.addLast("Priya");
        students.addLast("Aman");
        students.addFirst("Anushka");

        System.out.println("Student Queue: " + students);

        students.removeFirst();
        System.out.println("After removeFirst(): " + students);

        students.removeLast();
        System.out.println("After removeLast(): " + students);
    }
}