import java.util.Arrays;

class SortJaggedArray {
    public static void main(String[] args) {
        int arr[][] = {
            {5, 2, 4},
            {9, 1},
            {8, 3, 6, 7}
        };

        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }

        System.out.println("Sorted jagged array:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}