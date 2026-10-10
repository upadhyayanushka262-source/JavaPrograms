import java.util.Scanner;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int result[] = new int[5];
        int size = 0;

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            boolean found = false;

            for (int j = 0; j < size; j++) {
                if (arr[i] == result[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[size] = arr[i];
                size++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
    }
}