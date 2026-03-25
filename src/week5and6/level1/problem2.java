package week5and6.level1;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > 0) {
                if (arr[i] % 2 == 0)
                    System.out.println(arr[i] + " is Positive Even");
                else
                    System.out.println(arr[i] + " is Positive Odd");
            } 
            else if (arr[i] < 0) {
                System.out.println(arr[i] + " is Negative");
            } 
            else {
                System.out.println("Zero");
            }
        }

        // Compare first and last
        if (arr[0] == arr[4]) {
            System.out.println("First and last are equal");
        } else if (arr[0] > arr[4]) {
            System.out.println("First is greater than last");
        } else {
            System.out.println("First is less than last");
        }
        sc.close();
    }
}