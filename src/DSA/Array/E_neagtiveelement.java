package Array;

import java.util.Scanner;

public class E_neagtiveelement {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        System.out.println(" Enter the no. of elements : ");
        int n = g.nextInt();
        int arr[] = new int[n];
        int k = 0;
        System.out.println(" enter the elements");

        for (int i = 0; i < n; i++) {
            arr[i] = g.nextInt();
        }
        System.out.println("Negative elements :");
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " " );
            }
        }

    }
}

