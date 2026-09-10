package week03;

import java.util.Scanner;

public class IfElseIfElse {
    public static void main(String[] args) {
        int x = 7;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int y = in.nextInt();



        System.out.println("point 1");
        if (x < y) {
            System.out.println("point 2");
//        } else {
//            System.out.println("something here");
        } else if (x > y) {
            System.out.println("point 3");
        } else {
            // if x is not greater than or less than y
            // they must be the same
            System.out.println("point 4");
        }
        System.out.println("point 5");

//        y;
//        System.out.println(y);
//        System.out.println(z);
        // curly braces - block of code
        {
            int z = 5;
//            System.out.println(z);
            // ()
            // []
            // {}
            // / - fwd slash
            // \ - backslash
            // ~ - tilde
        }
        // z has fallen out of scope
//        System.out.println(z);
    }
}
