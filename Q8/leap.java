package Q8;
import java.util.Scanner;

public class leap {
    public static void main(String args[])
    {
        System.out.println("Enter the Year");
        Scanner scn= new Scanner(System.in);
        int year=scn.nextInt();
        if(year%4==0 && year%100!=0)
        {
            System.out.println("Leap Year");
        }
        else if(year%100==0)
        {
            if(year%400==0)
            {
                System.out.println("Leap Year");
            }
            else
            {
                System.out.println("Not Leap Year");
            }
        }
        else
        {
            System.out.println("Not Leap Year");
        }
    }
}
