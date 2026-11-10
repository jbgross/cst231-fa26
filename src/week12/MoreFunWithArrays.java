package week12;

import java.util.Scanner;

public class MoreFunWithArrays {
    public static void main(String[] args) {
        int x = 5;
        int y = x;
        y++;
        System.out.println(x);
        int [] b = {12}; // initialization syntax
        System.out.println(b[0]);
        int [] c = b;
        c[0] = 100;
        System.out.println("updated value: " + b[0]);
        int [] d = {b[0]};
        d[0] = 56;
        System.out.println("updated value - b[0]: " + b[0]);
        System.out.println("updated value - d[0]: " + d[0]);

        int [] a = new int[4];
        System.out.println(a);
        System.out.println(a[0]);
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
            System.out.print("Enter a whole number: ");
            int newNum = in.nextInt();
            a[i] = newNum;
//            System.out.print(a[i] + " ");
        }

        int sum = sum(a);
        System.out.println("sum of array: " + sum);

        printBackwards(a);
        printBackwards(a);
        System.out.println("new sum of array: " + sum(a));
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
    }

    public static int sum(int [] q) {
        int sum = 0;
        for (int i = 0; i < q.length; i++) {
//            sum += q[i];
            sum = sum + q[i];
        }
        return sum;
    }

    public static void printBackwards(int [] data) {
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.print(data[i] + " ");
            data[i] = 0;
        }
        System.out.println();
    }
}
