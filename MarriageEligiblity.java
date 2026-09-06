import java.util.Scanner;
public class MarriageEligiblity {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter age: ");
         int age = sc.nextInt();
         System.out.print("Enter gender (M/F): ");
         char gender = sc.next().charAt(0);
         if (gender == 'M' || gender == 'm') {

            if (age >= 21) {
                System.out.println("Eligible for Marriage");
            }
            else {
                System.out.println("Not Eligible for Marriage");
            }
        }
        else if (gender == 'F' || gender == 'f') {

            if (age >= 18) {
                System.out.println("Eligible for Marriage");
            }
            else {
                System.out.println("Not Eligible for Marriage");
            }
        }
        else {
            System.out.println("Invalid Gender");
        }
    }
}
