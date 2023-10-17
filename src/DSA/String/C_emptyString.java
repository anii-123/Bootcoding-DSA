package String;

import java.util.*;

public class C_emptyString {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter first word");
        String s = n.nextLine();
        System.out.println("Enter any second word");
        String r= n.nextLine();

        boolean r1= false;
        boolean r2 = false;

        if (s.length() == 0)
            r1=true;
        if (r.length()==0)
            r2 = true;

        System.out.println("Is String is " + s + " empty ?  -> " + r1 );

        System.out.println("Is String is " + r + " empty ?  -> " + r2 );


    }
}