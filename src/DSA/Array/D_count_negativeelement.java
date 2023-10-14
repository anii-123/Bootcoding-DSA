package Array;

import java.util.Scanner;

public class D_count_negativeelement {
    public static void main(String[] args) {
        Scanner f= new Scanner(System.in);
        System.out.println("Enter no. of element : ");
        int n= f.nextInt();
        int arr[] =new int[n];
        int k=0;
        int l=0;
        int count =0;

        System.out.println("Enter the elements : ");
        for (int i =0; i<n ; i++){
            arr[i] = f.nextInt();
        }
        for (int i= 0 ; i<n ; i++){
            if (arr[i] <0 ){
                k=count++;
                System.out.println(" Elements is negative :" + arr[i]);
            }
            else {
                l=count++;
                System.out.println("Elements is positive : " + arr[i]);
            }
        }
        System.out.println("Total no. of  negative  element :" + k);
        System.out.println("Total no. of  positive element : " + l );
    }
}
