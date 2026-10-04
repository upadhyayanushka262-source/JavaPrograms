import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's marks: ");
        int marks = sc.nextInt();

        try {
            if (marks < 0 || marks > 100) {
                throw new Exception("Marks must be between 0 and 100.");
            }

            System.out.println("Valid marks = " + marks);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}