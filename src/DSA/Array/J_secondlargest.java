package Array;

import java.util.Scanner;

public class J_secondlargest {
    public static void main(String[] args) {
        Scanner g=new Scanner(System.in);
        System.out.println("Enter the no. of element");
        int n=g.nextInt();
        int arr[]= new int[n];
        System.out.println("enter element");
        int max=0;
        int secmax =0;
        for(int i=0; i<n;i++){
            arr[i] =g.nextInt();
        }
        System.out.println("maximum number");
        for(int i=0;i<n;i++){
            if (arr[i] >max){
                max=arr[i];
            }
        }
        System.out.println(max);
        System.out.println("second maximum number");
        for(int i=0;i<n;i++) {
            if (arr[i] > secmax && arr[i] != max) {
                secmax = arr[i];

            }
        }
            System.out.println(secmax);

    }
}
