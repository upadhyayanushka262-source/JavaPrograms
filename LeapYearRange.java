import java.util.Scanner;

public class LeapYearRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter starting year: ");
        int start = sc.nextInt();

        System.out.print("Enter ending year: ");
        int end = sc.nextInt();

        boolean leapYear = (year % 400 == 0) ||
                           (year % 4 == 0 && year % 100 != 0);

        if (leapYear && year >= start && year <= end) {
            System.out.println("The year is a leap year and is within the given range.");
        } else {
            System.out.println("The condition is not satisfied.");
        }
    }
}