package Array;

import java.util.Scanner;

public class T_uniqueelement {
    public static void main(String[] args) {
        Scanner u= new Scanner(System.in);
        System.out.println("Enter Array Limit : ");
        int n = u.nextInt();
        int h[] = new int[n];
        System.out.println("Enter array element ");
        for (int i=0; i<n ; i++){
            h[i]= u.nextInt();
        }
        System.out.println("Unique Element : ");
        for(int i=0 ; i<n ;i++){
            for (int j=0;j<i;j++)
            {
                if(h[j]==h[i])
                    System.out.print(h[i] + " ");
            }
        }

    }
}
