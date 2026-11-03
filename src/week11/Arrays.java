package week11;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        x = 10;
        System.out.println(x);
        Scanner s = new Scanner(System.in);

//        System.out.println(a[0]);
        int [] a = new int[5];
//        a = 5; // datatype mismatch

        System.out.println(a[0]);
        a[0] = 7;
        System.out.println(a[0]);
        System.out.println(a[1]);
        a[1] = 6;
        System.out.println(a[1]);
        a[1]--;
        System.out.println(a[1]);


        System.out.println(a.length);
        // ArrayIndexOutOfBoundsException
//        System.out.println(a[5]);

        double [] b = new double[5];
        System.out.println(b[0]);
    }
}
