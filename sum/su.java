package sum;
import java.util.Scanner;

public class su {
   public static void main(String args[]) {
    System.out.println("Enter the number");
    Scanner s=new Scanner(System.in);
    int num;
    int x=1;
    int sum=0;
    num=s.nextInt();
        do{
            if(x%2==0)
            {
                sum=sum+x;
            }
            x=x+1;
    }while(x<=num);
    System.out.println("The sum of Even Numbers is "+ sum);
   }
}
