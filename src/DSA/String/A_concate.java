package String;

import java.util.Scanner;

public class A_concate {
    public static void main(String[] args) {
        Scanner d= new Scanner(System.in);
        System.out.println("Enter first name");
        String l=d.nextLine();

        System.out.println("Enter second name");
        String s1=d.nextLine();

        String w= l.concat(s1);

        System.out.println(w);
    }

}
