
import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = Math.sqrt(
                (x2 - x1) * (x2 - x1) +
                (y2 - y1) * (y2 - y1)
        );

        System.out.println("Distance = " + distance);
    }
}