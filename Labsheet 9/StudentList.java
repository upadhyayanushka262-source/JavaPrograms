import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Anushka");
        students.add("Rahul");
        students.add("Priya");
        students.add("Aman");
        students.add("Sneha");
        students.add("Rohit");
        students.add("Neha");
        students.add("Karan");
        students.add("Pooja");
        students.add("Arjun");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }

        System.out.println("Total Students: " + students.size());
    }
}