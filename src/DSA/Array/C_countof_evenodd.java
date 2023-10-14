package Array;

import java.util.Scanner;

public class C_countof_evenodd {
    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);
        System.out.println("Enter no.of element in array :");
        int n= c.nextInt();
        int arr[]=new int[n];
        int count =0;
        int k = 0;
        int l =0;
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++){
            arr[i]=c.nextInt();
        }
        for (int i=0; i<n;i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("element is even no. " + arr[i]);
                k = count++;
            } else {
                System.out.println("element is odd no. " + arr[i]);
                l = count++;
            }
        }

            System.out.println("total even no. is " + k);
            System.out.println("total odd no. is " + l);

    }
}
