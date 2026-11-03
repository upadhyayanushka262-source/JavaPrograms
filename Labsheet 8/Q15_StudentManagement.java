import java.util.*;

class Student15<T, U, V> {
    T id;
    U name;
    V marks;

    Student15(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

public class Q15_StudentManagement {

    public static void main(String[] args) {

        ArrayList<Student15<Integer, String, Double>> list =
            new ArrayList<>();

        list.add(new Student15<>(101, "Aman", 85.5));
        list.add(new Student15<>(102, "Riya", 90.0));
        list.add(new Student15<>(103, "Rahul", 78.5));
        list.add(new Student15<>(104, "Neha", 88.0));
        list.add(new Student15<>(105, "Anu", 92.5));

        System.out.println("All Students:");

        for (Student15<Integer, String, Double> s : list) {
            s.display();
        }

        System.out.println("Search Student ID: 103");

        boolean found = false;

        for (Student15<Integer, String, Double> s : list) {
            if (s.id.equals(103)) {
                System.out.println("Student Found:");
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }

        System.out.println("Total Students: " + list.size());

        System.out.println("Student at index 0:");
        list.get(0).display();

        System.out.println("Contains check: " +
            list.contains(list.get(0)));
    }
}