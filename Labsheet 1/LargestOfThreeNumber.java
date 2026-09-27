import java.util.Scanner;
public class LargestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter 3rd number: ");
        double num3 = sc.nextDouble();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("1st Number is greater");
        }
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println("2nd Number is greater");
        }
        else {
            System.out.println("3rd Number is greater");
        }
    }
}


