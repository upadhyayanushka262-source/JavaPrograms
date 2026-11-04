import java.util.ArrayList;

public class UpdateStudentName {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Aman");
        students.add("Sneha");
        students.add("Rohit");

        students.set(1, "Anushka");
        students.remove(3);

        System.out.println("Updated Student List:");

        for (String name : students) {
            System.out.println(name);
        }
    }
}