
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Division result = " + result);

            int[] arr = new int[5];

            System.out.println("Enter 5 array elements:");

            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            System.out.println("Array element = " + arr[index]);

            sc.nextLine();

            System.out.print("Enter a number as a String: ");
            String number = sc.nextLine();

            int n = Integer.parseInt(number);

            System.out.println("Integer = " + n);
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }

        catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}