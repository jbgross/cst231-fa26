package week11;

import java.util.Scanner;

public class ArrayLoops {

    public static void main(String[] args) {
        int a = 5;
        System.out.println("in main, a is " + a);
        changeX(a);
        System.out.println("in main, a is " + a);
        changeY(a);
        System.out.println("in main, a is " + a);
        a = changeY(a);
        System.out.println("in main, a is " + a);

        System.out.println();

        int [] primes = {2, 3, 5, 7};
        print(primes);
//        for (int i = 0; i < primes.length; i++) {
//            System.out.print(primes[i] + " ");
//        }
//        System.out.println();

        int [] evens = {0, 2, 4, 6, 8, 10, 12, 14, 16};
        print(evens);
        print(primes);

        int [] userNumbers = new int[5];
        loadArray(userNumbers);
        print(userNumbers);
    }

    public static int changeY(int y) {
        System.out.println("in changeY, y is " + y);
        y++;
        System.out.println("in changeY, y is " + y);
        return y;
    }

    public static void changeX(int x) {
        System.out.println("in changeX, x is " + x);
        x++;
        System.out.println("in changeX, x is " + x);
    }

    public static void loadArray(int [] a) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a number: ");
            int input = in.nextInt();
            a[i] = input;
            // a[i] = in.nextInt();
        }
    }

    public static int sum(int [] s) {
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
//            sum += s[i];
            sum = sum + s[i];
        }
        return sum;
    }

    public static void print(int [] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println(

        );
    }
}
