import java.util.Scanner;
public class PositiveNegativeOrZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
         int num1 = sc.nextInt();
         if (num1 > 0) {
             System.out.println("Number is positive");
         }
         else if (num1 < 0) {
             System.out.println("Number is negative");
         }
         else if (num1 == 0){
             System.out.println("Number is zero");
         }
    }
}

