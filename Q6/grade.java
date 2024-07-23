package Q6;
import java.util.Scanner;

public class grade {
   public static void main(String args[]) 
   {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the Number");
        int no=scn.nextInt();
        switch (no/10) {
            case 10:
                System.out.println("Grade A Excellent !");
                break;
            case 9:
                System.out.println("Grade A Excellent !");
                break;
            case 8:
                System.out.println("Grade B Very Good");
                break;
            case 7:
                System.out.println("Grade C Good");
                break;
            case 6:
                System.out.println("Grade D Satisfactory");
                break;
            case 5:
                System.out.println("Grade F Fail !");
                break;
            case 4:
                System.out.println("Grade F Fail !");
                break;
            case 3:
                System.out.println("Grade F Fail !");
                break;
            case 2:
                System.out.println("Grade F Fail !");
                break;
            case 1:
                System.out.println("Grade F Fail !");
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }
   }
}
