import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("Enter 5 array elements:");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter array index: ");
        int index = sc.nextInt();

        try {
            System.out.println("Element = " + a[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }
    }
}