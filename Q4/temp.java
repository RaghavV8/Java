package Q4;

import java.util.Scanner;

public class temp {
   public static void main(String args[]){
    System.out.println("Enter the Temperature");
    try (Scanner scn = new Scanner(System.in)) {
        int t=scn.nextInt();
        if(t>30)
        {
            System.out.println("It's Hot");
        }
        else if(t>=20&&t<30)
        {
            System.out.println("It's Warm");
        }
        else if(t>=10&&t<20){
            System.out.println("It's cool");
        }
        else
        {
            System.out.println("It's cold");
        }
    }
   }
}
