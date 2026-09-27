import java.util.Scanner;
public class ASCIIValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char ch = sc.next().charAt(0);
        System.out.println("Character : " + ch);
        System.out.println("ASCII Value : "+ (int)ch);
    }
}
