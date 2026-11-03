import java.util.*;

public class Q9_GenericArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i * 10);
        }

        for (int n : list) {
            System.out.println(n);
        }
    }
}