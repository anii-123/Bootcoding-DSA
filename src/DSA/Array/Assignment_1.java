package Array;

import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of element that you want to store ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter number of element");
        for (int i = 0; i <n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Array element are : ");

        for (int i = 0; i < n; i++) {
            System.out.print( arr[i] + "  ");
        }

    }
}

