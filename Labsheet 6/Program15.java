
import java.util.Scanner;

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String message) {
        super(message);
    }
}

class InsufficientMedicineStockException extends Exception {
    InsufficientMedicineStockException(String message) {
        super(message);
    }
}

public class Program15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter medicine name: ");
            String medicineName = sc.nextLine();

            System.out.print("Enter available quantity: ");
            String availableInput = sc.nextLine();

            System.out.print("Enter required quantity: ");
            String requiredInput = sc.nextLine();

            int available = Integer.parseInt(availableInput);
            int required = Integer.parseInt(requiredInput);

            if (available < 0 || required < 0) {
                throw new InvalidQuantityException(
                        "Quantity cannot be negative.");
            }

            if (required > available) {
                throw new InsufficientMedicineStockException(
                        "Required quantity is greater than available stock.");
            }

            System.out.println("Medicine: " + medicineName);
            System.out.println("Available quantity: " + available);
            System.out.println("Required quantity: " + required);
            System.out.println("Transaction successful.");
        }

        catch (NumberFormatException e) {
            System.out.println("Invalid numeric input.");
        }

        catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        catch (InsufficientMedicineStockException e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Inventory transaction completed.");
        }
    }
}