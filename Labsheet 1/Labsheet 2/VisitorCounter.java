import java.util.Scanner;

public class VisitorCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int visitors = 0;

        System.out.print("Enter visitors entering: ");
        int entering = sc.nextInt();

        for (int i = 0; i < entering; i++) {
            ++visitors;
        }

        System.out.println("Visitors after entering = " + visitors);

        System.out.print("Enter visitors leaving: ");
        int leaving = sc.nextInt();

        for (int i = 0; i < leaving; i++) {
            visitors--;
        }

        System.out.println("Visitors remaining = " + visitors);
    }
}
