import java.util.Scanner;
public class RelationalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
                int a = sc.nextInt();
        System.out.print("Enter second number : ");
            int b = sc.nextInt();

        System.out.println((a == b ) + ": A is Equal to B");
        System.out.println(( a > b) + " : A is greater than B");
        System.out.println(( a < b ) + ": B is greater than A");
        System.out.println (( a<=b ) + ": A is greater than or equal to B");
        System.out.println(( a >=b ) + ": A is less than or equal to B");
        System.out.println(( a !=b ) + ": A is not equal to B " );
    }
}
