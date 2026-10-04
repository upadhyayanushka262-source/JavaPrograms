
import java.util.Scanner;

class InvalidExamMarksException extends Exception {
    InvalidExamMarksException(String message) {
        super(message);
    }
}

public class Program14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's marks: ");
        String marksInput = sc.nextLine();

        try {
            int marks = Integer.parseInt(marksInput);

            if (marks < 0 || marks > 100) {
                throw new InvalidExamMarksException(
                        "Marks must be between 0 and 100.");
            }

            System.out.println("Marks = " + marks);

            if (marks >= 40) {
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }

        catch (NumberFormatException e) {
            System.out.println("Invalid numeric input.");
        }

        catch (InvalidExamMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Exam evaluation completed.");
        }
    }
}