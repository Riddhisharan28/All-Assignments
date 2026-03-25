package week1and2.level3;

import java.util.Scanner;

public class problem2 {
 public static void main(String[] args)
    {
       System.out.println("Enter the temperature in celsius:");
       Scanner sc=new Scanner(System.in);
       double celsius=sc.nextDouble();
       double fahrenheit=(celsius*9/5)+32;
       System.out.println("The  "+celsius+" celsius is "+fahrenheit+" fahrenheit");
       sc.close();
    }
}
