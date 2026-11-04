import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            File file = new File("employees.txt");
            FileWriter fw = new FileWriter(file);

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            fw.write(id + "," + name + "," + dept + "," + salary);
            fw.close();

            System.out.println("Employee record saved successfully.");

            System.out.print("Enter Employee ID to search: ");
            int searchId = sc.nextInt();

            BufferedReader br = new BufferedReader(
                new FileReader(file));

            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (Integer.parseInt(data[0]) == searchId) {
                    System.out.println("Employee Record Found");
                    System.out.println("Employee ID: " + data[0]);
                    System.out.println("Employee Name: " + data[1]);
                    System.out.println("Department: " + data[2]);
                    System.out.println("Salary: " + data[3]);

                    found = true;
                    break;
                }
            }

            br.close();

            if (!found) {
                System.out.println("Employee record not found.");
            }
        }
        catch (IOException e) {
            System.out.println("File does not exist or error occurred.");
        }

        sc.close();
    }
}