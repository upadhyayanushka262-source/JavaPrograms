import java.util.Scanner;
public class VowelsOrConstant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
       if ( ch =='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch ==  'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
           System.out.println("Character is a Vowel");
       } else
           System.out.println("Character is a consonants");
    }
}

