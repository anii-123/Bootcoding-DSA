package Array;

import java.util.Scanner;

public class Z_sortin_decendingorder {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = k.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements");
        int i = 0;
        int temp = 0;
        for (i = 0; i < n; i++) {
            a[i] = k.nextInt();
        }
        //sort
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        //display
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
