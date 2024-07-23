package Q5;
import java.util.Scanner;

public class sign {
   public static void main(String args[]) 
   {
        int num;
        System.out.println("Enter the number");
        Scanner scn= new Scanner(System.in);
        num = scn.nextInt();
        if(num>0){
            System.out.println("The Number is Positive");
        }
        else if(num<0)
        {
            System.out.println("The Number is Negative");
        }
        else
        {
            System.out.println("The Number is zero");
        }
   }
}
