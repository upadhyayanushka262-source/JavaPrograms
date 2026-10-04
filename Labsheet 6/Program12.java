import java.util.Scanner;

class InvalidPatientAgeException extends Exception {
    InvalidPatientAgeException(String message) {
        super(message);
    }
}

public class Program12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter patient name: ");
        String name = sc.nextLine();

        System.out.print("Enter patient age: ");
        String ageInput = sc.nextLine();

        try {
            int age = Integer.parseInt(ageInput);

            if (age < 0 || age > 120) {
                throw new InvalidPatientAgeException(
                        "Patient age must be between 0 and 120.");
            }

            System.out.println("Patient name: " + name);
            System.out.println("Patient age: " + age);
            System.out.println("Age is valid.");
        }

        catch (NumberFormatException e) {
            System.out.println("Invalid numeric input for age.");
        }

        catch (InvalidPatientAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}