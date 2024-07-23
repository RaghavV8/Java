package Q3;
import java.util.Scanner;

public class vend {
    public static void main(String args[]){
        int choice;
        System.out.println("Press 1 for juice or 2 for soda");
        try (Scanner scn = new Scanner(System.in)) {
            choice = scn.nextInt();
        }
        if(choice==1)
        {
            System.out.println("Dispensing juice");
        }
        else if(choice==2){
            System.out.println("Dispensing soda");
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}
