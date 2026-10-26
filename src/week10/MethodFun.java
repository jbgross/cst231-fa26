package week10;

import java.util.Scanner;

public class MethodFun {

    public static void main(String[] args) {
        foo();
        System.out.println("starting");
        printHello();
        System.out.println("stopping");

        returnFive();
        System.out.println(returnFive());
        int x = returnFive();
        System.out.println("x = " + x);
        int y = returnFive() + 10;
        System.out.println(y);
        int z = returnFive() * returnFive();
        System.out.println("z = " + z);

        printDouble(z);
        multiply(3, 4);
        System.out.println(multiply(4, 7));
        int product = 2; //multiply(8, 3);
        int x2 = multiply(8, 3);
        System.out.println(product);
        String n = getNumber();
        System.out.println(n);
        for (int i = 0; i < 5; i++) {
            int value = getNumberInRange(1, 10);
            System.out.println("value: " + value);
        }

    }

    public static int getNumberInRange(int min, int max) {
        Scanner in = new Scanner(System.in);
        int input;
        do {
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            input = in.nextInt();
        } while (input < min || input > max);
        return input;
    }

    public static String getNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
//        int number = in.nextInt ();
        String number = in.next();
        return number;
    }

    public static int multiply(int a, int b) {
        System.out.println("multiplying " + a + " times " + b);
        int product = a * b;
        return product;
    }

    public static void printDouble(int number) {
        System.out.println(number * 2);
    }

    public static int returnFive() {
        return 5;
    }

    public static void printHello () {
        System.out.println("Hello");
    }

    public static void foo() {
        bar();
        System.out.println("foo");
    }

    public static void bar() {
        quux();
        System.out.println("bar");
    }

    public static void quux() {
        System.out.println("quux");
    }
}
