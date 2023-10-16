package Array;

import java.util.Scanner;

public class N_insertelementin_middle {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter no. of element");
        int n= o.nextInt();
        int arr[]= new int[n];
        System.out.println("enter elements");
        for(int i=0; i<n; i++){
            arr[i]=o.nextInt();
        }
        System.out.println("insert element");
        int p = o.nextInt();
        System.out.println("insert in position");
        int position= o.nextInt();
        int dummy[]= new int[n+1];
        for (int j=0;j<position+1; j++){
            dummy[j]=arr[j];
        }
        for (int i= position+1;i<dummy.length;i++){
            dummy[i]=arr[i-1];
        }
        dummy[position]=p;
        for (int j=0;j<dummy.length;j++){
            System.out.print(dummy[j] + "  ");
        }
    }
}
