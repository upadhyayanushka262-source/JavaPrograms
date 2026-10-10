import java.util.Scanner;

class SumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];
        int sum = 0;

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
                sum = sum + arr[i][j];
            }
        }

        System.out.println("Sum = " + sum);
    }
}