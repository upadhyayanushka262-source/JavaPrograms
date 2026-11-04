import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentCollectionManagement {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        HashSet<Integer> ids = new HashSet<>();
        TreeSet<Integer> sortedIds = new TreeSet<>();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display Students");
            System.out.println("5. Count Students");
            System.out.println("6. Forward Traversal");
            System.out.println("7. Backward Traversal");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    if (ids.add(id)) {
                        students.add(name);
                        sortedIds.add(id);
                        System.out.println("Student Added Successfully.");
                    } else {
                        System.out.println("Student ID already exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = sc.nextInt();

                    if (ids.remove(removeId)) {
                        int index = 0;
                        for (int studentId : sortedIds) {
                            if (studentId == removeId) {
                                break;
                            }
                            index++;
                        }

                        sortedIds.remove(removeId);
                        System.out.println("Student Removed Successfully.");
                    } else {
                        System.out.println("Student ID Not Found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();

                    if (ids.contains(searchId)) {
                        System.out.println("Student ID Found.");
                    } else {
                        System.out.println("Student ID Not Found.");
                    }
                    break;

                case 4:
                    System.out.println("Student Names: " + students);
                    System.out.println("Unique IDs: " + ids);
                    System.out.println("Sorted IDs: " + sortedIds);
                    break;

                case 5:
                    System.out.println("Total Students: " + students.size());
                    break;

                case 6:
                    ListIterator<String> forward =
                            students.listIterator();

                    System.out.println("Forward Traversal:");

                    while (forward.hasNext()) {
                        System.out.println(forward.next());
                    }
                    break;

                case 7:
                    ListIterator<String> backward =
                            students.listIterator(students.size());

                    System.out.println("Backward Traversal:");

                    while (backward.hasPrevious()) {
                        System.out.println(backward.previous());
                    }
                    break;

                case 8:
                    System.out.println("Exiting Program.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 8);

        sc.close();
    }
}