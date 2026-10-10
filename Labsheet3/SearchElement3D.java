import java.util.Scanner;

class SearchElement3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][][] = new int[2][2][2];
        boolean found = false;

        System.out.println("Enter 8 integers:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("Enter element to search:");
        int search = sc.nextInt();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (arr[i][j][k] == search) {
                        System.out.println("Found at position: "
                                + (i + 1) + ", " + (j + 1)
                                + ", " + (k + 1));
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}