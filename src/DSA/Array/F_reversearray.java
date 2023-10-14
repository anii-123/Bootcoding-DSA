package Array;

import java.util.Scanner;

public class F_reversearray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the no.of elements : ");
        int n= s.nextInt();
        int k=0;
            int arr[] = new int[n];
        System.out.println("Enter elements : ");
            for (int i= 0; i < n ;i++){
                arr[i]= s.nextInt();
            }
        System.out.println("Reverse of an array");
            for (int i=n-1; i>=0; i--) {
                System.out.print(arr[i] + " ");
            }
    }
}
