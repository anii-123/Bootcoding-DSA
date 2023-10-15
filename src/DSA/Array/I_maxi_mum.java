package Array;

import java.util.Scanner;

public class I_maxi_mum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter no. of elements : ");
        int n= s.nextInt();
        System.out.println(" Enter elements :");
        int arr[]= new int[n];
        int max=arr[0];
        int mini=arr[0];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();

        }
        for(int i=0;i<n;i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < mini) {
                mini = arr[i];

            }
        }
            System.out.println(max);
            System.out.println(mini);

    }
}
