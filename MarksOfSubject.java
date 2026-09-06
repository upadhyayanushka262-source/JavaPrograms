import java.util.Scanner;
public class MarksOfSubject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of 1st subject : ");
        double m1 = sc.nextDouble();
        System.out.print("Enter marks of 2nd subject : ");
        double m2 = sc.nextDouble();
        System.out.print("Enter marks of 3rd subject : " );
        double m3 = sc.nextDouble();
        double total = m1 + m2 + m3;
        System.out.println("Total marks obtained : "+ total);
        double percent = total / 3 ;
        System.out.println("Percentage  : "+ percent);
        if (m1 >= 40 && m2 >= 40 && m3 >= 40){
            System.out.println("Student is passed");
        }
        else
        {
            System.out.print("Student is fail");
        }
    }
}

