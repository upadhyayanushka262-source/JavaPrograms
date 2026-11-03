import java.util.*;

public class Q11_SearchGenericList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i * 10);
        }

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (list.contains(num)) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }

        sc.close();
    }
}