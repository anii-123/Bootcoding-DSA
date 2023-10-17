package Array;
import java.util.Scanner;

public class Y_sortin_ascendingorder {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int temp=0;
        System.out.println("Enter size of an array");
        int n= sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter Elements in array");
        for(int i=0;i<arr.length ; i++)
        {
            arr[i] =sc.nextInt();
        }
        System.out.println("Elements of original array : " );
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        for (int i=0; i<arr.length; i++){
            for(int j=i+1 ;j<arr.length; j++) {
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in ascending order : " );
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " " );
        }
    }
}

