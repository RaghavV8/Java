package Simple1;
import java.util.Scanner;

public class sim {
   public static void main(String args[])
   {
    int t;
    float rate;
    int principle;
    float interest=0;
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter the Years");
    t= scn.nextInt();
    System.out.println("Enter the rate");
    rate=scn.nextFloat();
    System.out.println("Enter the Principle");
    principle=scn.nextInt();
    for(int i =t;i>0;i--)
    {
        // for(int j=1;j<=rate;j++)
        // {
        //     interest=interest+principle;
        // }
        interest += (principle*rate*1)/100;
    }
    System.out.println("the interest is Rs "+interest);
   }  
}
