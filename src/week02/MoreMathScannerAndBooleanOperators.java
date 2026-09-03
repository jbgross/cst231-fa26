package week02;

import java.util.Scanner;

public class MoreMathScannerAndBooleanOperators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = in.nextInt();
        System.out.println(dividend);
        int divisor = 1;
        System.out.println("for divisor " + divisor + ": " + dividend / divisor + " - " + dividend % divisor);
        divisor++;
//        divisor = divisor + 1;
//        divisor += 1;
//        divisor =- 1; // BAD
        System.out.println("for divisor " + divisor + ": " + dividend / divisor + " - " + dividend % divisor);
        divisor++;
        System.out.println("for divisor " + divisor + ": " + dividend / divisor + " - " + dividend % divisor);
        divisor++;
        System.out.println("for divisor " + divisor + ": " + dividend / divisor + " - " + dividend % divisor);

        // java will not do anything with this
        int x = 1; // create an int variable called x and set to 1

        boolean b1 = true;
//        boolean b2 = True;
//        boolean b3 = "true";
//        boolean b4 = 0;
        boolean b5;
//        System.out.println(b5);
        b5 = false;
        boolean divisorEqualsDividend = divisor == dividend;
//        x + 1;
        System.out.println(x + 1);


    }
}
