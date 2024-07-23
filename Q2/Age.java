import java.util.Scanner;

public class Age{
    public static void main(String args[]){
        int age;
        System.out.println("Enter the Voter's Age");
        try (Scanner scn = new Scanner(System.in)) {
            age=scn.nextInt();
        }
        if(age<18)
        {
            System.out.println("You are not eligible to vote");
        }
        else
        {
            System.out.println("You are eligible to vote");
        }
    }
}