package Array;

import java.util.Scanner;

public class P_delete_in_array {
    public static void main(String[] args) {
        Scanner p= new Scanner(System.in);
        System.out.println("enter no. of element");
        int n=p.nextInt();
        System.out.println("enter element");
        int arr[]= new int[n];
        for (int i=0;i<n; i++){
            arr[i]=p.nextInt();
        }
        System.out.println("Enter index no. to remove ");
        int remove = p.nextInt();


        if (remove>=0 && remove<arr.length){
            int dummy []=new int[arr.length-1];
            int k=0;
            for(int j=0;j<arr.length;j++){
                if(j!= remove){
                    dummy [k]=arr[j];
                    k++;
                }
            }
            for (int i=0;i<dummy.length;i++){
                System.out.print(dummy[i] + " ");
            }
        }
        else{
            System.out.println("Array element is not found");
        }
    }
}
