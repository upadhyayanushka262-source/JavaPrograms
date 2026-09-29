import java.util.Scanner;

public class ShiftOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter power of 2: ");
        int power = sc.nextInt();

        int multiplied = number << power;
        int divided = number >> power;

        System.out.println("After multiplication = " + multiplied);
        System.out.println("After division = " + divided);
    }
}