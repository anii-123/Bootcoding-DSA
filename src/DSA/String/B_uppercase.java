package String;

import java.util.Scanner;

public class B_uppercase {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any name :");
        String i =s.nextLine();
        StringBuilder l = new StringBuilder(i);

        String o = i.toUpperCase();
        System.out.println(o);
    }
}
