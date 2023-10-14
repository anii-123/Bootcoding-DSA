package Array;

import java.util.Scanner;

public class B_count_number {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n= s.nextInt();
        int[] arr = new int[n];
        int count=0;
        System.out.println("enter no. of elements");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            count++;
        }
        System.out.println("Total no. of count is " + count);

    }
}
