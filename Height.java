import java.util.Scanner;
public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();
        if (height < 150) {
            System.out.println("Short");
        } else if (height >= 150 && height <= 170) {
            System.out.println("Average");
        } else {
            System.out.println("Tall");
        }
    }
}
