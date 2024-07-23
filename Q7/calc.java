package Q7;
import java.util.Scanner;

public class calc {
    public static void main(String args[])
    {
        int no;
        System.out.println("Enter 1 for Addition and 2 for Subtraction\n");
        Scanner scn = new Scanner(System.in);
        no=scn.nextInt();
        if(no==1){
            System.out.println("Enter the two numbers for Addition\n");
            int n1=scn.nextInt();
            int n2=scn.nextInt();
            int sum=n1+n2;
            System.out.println("The Sum is "+sum);
        }
        else if(no==2)
        {
            System.out.println("Enter the two numbers for Subtraction\n");
            int n1=scn.nextInt();
            int n2=scn.nextInt();
            int sub=n1-n2;
            System.out.println("The difference is "+sub);
        }
        else{
            System.out.println("Invalid Entry, Try Again !");
        }
    }
}
