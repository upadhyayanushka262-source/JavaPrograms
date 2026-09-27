import java.util.Scanner;
public class FloatingPointNumber {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Floating point number : ");
        double num = sc.nextDouble();
        int converted = (int)num;
        System.out.println("Original Value : "+ num);
        System.out.println("Converted number: " + converted);


    }
}
