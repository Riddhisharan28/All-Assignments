package week5and6.level1;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        System.out.println("Enter ages of 10 students:");

        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();

            if (ages[i] < 0) {
                System.out.println("Invalid age");
            } 
            else if (ages[i] >= 18) {
                System.out.println("Student with age " + ages[i] + " can vote");
            } 
            else {
                System.out.println("Student with age " + ages[i] + " cannot vote");
            }
        }
        sc.close();
    }
}