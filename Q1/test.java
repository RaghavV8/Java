import java.util.Scanner;

public class test{
    public static void main(String args[])
    {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the Number");
            int num = scn.nextInt();
            if(num%2==0)
            {
                System.out.println("The number is even");
            }
            else{
                System.out.println("The number is Odd");
            }
        }
    }
}