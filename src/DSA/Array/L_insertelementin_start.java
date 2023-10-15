package Array;

import java.util.Scanner;

public class L_insertelementin_start {
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        System.out.println("enter no.of element");
        int n= l.nextInt();
        int arr[]= new int[n];
        System.out.println("enter element");
        for(int i=0; i<n ;i++){
            arr[i]=l.nextInt();
        }
        System.out.println("enter insert value");
        int p =l.nextInt();
        int dummy[] = new int[n+1];
        dummy[0]=p;
        for (int j=1;j<=n;j++){
            dummy[j]=arr[j-1];
        }
        for (int j=0;j<dummy.length;j++){
            System.out.print(dummy[j] + " ");
        }
    }
}
