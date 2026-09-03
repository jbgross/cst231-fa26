package week02;

import java.util.Scanner;

// started conditionals in week 2 because week 3
// starts with labor day this year
public class EarlyConditionals {
    public static void main(String[] args) {
        System.out.println("point 1");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        if (a > b) {
            // block of code { }
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(a + " is less than " + b);
        }

        System.out.println("point 3");
    }
}
