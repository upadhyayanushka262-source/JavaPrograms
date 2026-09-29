import java.util.Scanner;

public class MixedAdvanced {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check whether the number is a power of 4
        int temp = number;

        while (temp > 1 && (temp & 3) == 0) {
            temp = temp >> 2;
        }

        if (number > 0 && temp == 1) {
            System.out.println(number + " is a power of 4.");
        } else {
            System.out.println(number + " is not a power of 4.");
        }

        // Toggle the 3rd bit
        int toggled = number ^ (1 << 2);

        System.out.println("Number after toggling 3rd bit = " + toggled);

        // Multiplication table
        System.out.println("Multiplication table:");

        for (int i = 1; i <= 10; i++) {

            int result = number * i;

            // Skip multiples of 6
            if (result % 6 == 0) {
                continue;
            }

            // Stop at multiples of 48
            if (result % 48 == 0) {
                break;
            }

            System.out.println(number + " x " + i + " = " + result);
        }
    }
}