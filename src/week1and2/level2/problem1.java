package week1and2.level2;

import java.util.Scanner;

public class problem1 {
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("The perimeter of the square is ");
        int perimeter = sc.nextInt();
        double side = perimeter / 4.0;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        sc.close();
    }
    
}
