package week1and2.level2;

import java.util.Scanner;

public class problem2 {
  public static void main(String[] args) {
       System.out.println("Enter number1: ");
        Scanner sc= new Scanner(System.in);
        sc.close();
        int number1= sc.nextInt();
        System.out.println("Enter number2: ");
        int number2=sc.nextInt();
        double quotient= number1/number2;
        int remainder= number1%number2;
        System.out.println("The quotient is " + quotient + " and the remainder is " + remainder);

    } 
}
