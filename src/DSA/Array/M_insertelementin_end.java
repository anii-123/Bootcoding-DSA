package Array;

import java.util.Scanner;

public class M_insertelementin_end {
    public static void main(String[] args) {
        Scanner f=new Scanner(System.in);
        System.out.println("enter the no. of element");
        int n=f.nextInt();
        int arr[]= new int[n];
        System.out.println("enter element");
        for(int i=0;i<n;i++){
            arr[i]=f.nextInt();
        }
        System.out.println("insert last element");
        int p= f.nextInt();
        int dummy[]= new int[n+1];
        dummy[n]=p;
        for(int j=0;j<n;j++){
            dummy[j]=arr[j];
        }
        for (int j=0;j<dummy.length;j++){
            System.out.print(dummy[j] + " ");
        }
    }
}
