package Array;

import java.util.Scanner;

public class O_linearsearch {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("Enter no. of element");
        int n=u.nextInt();
        int k=0;
        int arr[]=new int[n];
        System.out.println("enter element");
        for(int i=0;i<n; i++){
            arr[i]=u.nextInt();
        }
        System.out.println("enter search element");
        int p=u.nextInt();
        for(int i=0;i<n;i++){
            if (p==arr[i]){
                k=arr[i];
                System.out.print(k);
            }
        }
            System.out.println("element is not found ");
        }


    }

