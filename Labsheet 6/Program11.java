import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Program11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account balance: ");
            String balanceInput = sc.nextLine();

            System.out.print("Enter withdrawal amount: ");
            String withdrawalInput = sc.nextLine();

            double balance = Double.parseDouble(balanceInput);
            double withdrawal = Double.parseDouble(withdrawalInput);

            if (withdrawal < 0) {
                throw new Exception("Withdrawal amount cannot be negative.");
            }

            if (withdrawal > balance) {
                throw new InsufficientBalanceException(
                        "Insufficient balance.");
            }

            double remainingBalance = balance - withdrawal;

            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance = " + remainingBalance);
        }

        catch (NumberFormatException e) {
            System.out.println("Invalid numeric input.");
        }

        catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Bank transaction completed.");
        }
    }
}