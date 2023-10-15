package Array;

import java.util.Scanner;

public class K_copy_one_to_another {
    public static void main(String[] args) {
        Scanner h= new Scanner(System.in);
        System.out.println("Enter no.of element");
        int n= h.nextInt();
        int a[]= new int[n];
        int k;
        System.out.println("enter element of 1st array");
        for(int i=0;i<n;i++){
            a[i] =h.nextInt();
        }
        System.out.println("Second array");
        int b[]= new int[n];
        for(int i=0; i<n;i++){
           b[i]=a[i];
            System.out.print(b[i] + " ");
        }


    }
}
