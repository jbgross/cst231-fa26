package week13;

import java.util.Random;
import java.util.Scanner;

public class Mon_2DArrays {
    public static void main(String[] args) {
        int [] a = new int[5];
//        print(a);
//        for (int i = 0; i < a.length; i ++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();

        int [][] data = new int[5][8];
        print(data);
        System.out.println();
        fill(new Random(-6), data);
        print(data);

        String [][] page = new String[4][3];
        Scanner in = new Scanner(System.in);
        fill(in, page);
        print(page);
//        System.out.println(a);
//        System.out.println(data);
//        print(data);
//        for (int i = 0; i < data.length; i++) {
////            System.out.println(data[i]);
//            print(data[i]);
//        }
    }

    public static void print(String [][] s) {

    }

    public static void fill(Scanner in, String [][] s) {
        for (int r = 0; r < s.length; r++) {
            for (int c = 0; c < s[r].length; c++) {
                System.out.print("Enter word: ");
                s[r][c] = in.next();
            }
        }
    }

    public static void fill(Random rand, int [][] x) {
        for (int r = 0; r < x.length; r++) {
            for (int c = 0; c < x[r].length; c++) {
                x[r][c] = Math.abs(rand.nextInt() % 10);
            }
        }
    }

    public static void print(int [][] d2) {
        for (int row = 0; row < d2.length; row++) {
            for (int col = 0; col < d2[row].length; col++) {
                System.out.print(d2[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void print(int [] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}
