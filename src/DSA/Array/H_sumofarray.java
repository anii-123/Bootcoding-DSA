package Array;

import java.util.Scanner;

public class H_sumofarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no.of elements");
        int n= s.nextInt();
        int sum=0;
        int arr[]= new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for (int i=0;i<n;i++){
            sum=sum+arr[i];
            System.out.println("sum of elements " + sum);
        }
        System.out.println("total sum is : "+ sum);
    }
}
