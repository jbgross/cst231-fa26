package week13;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Wed2DArrays {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/week13/words.txt");
        Scanner fs = new Scanner(fr);
        int size = fs.nextInt();
        String [] words = new String[size];

        for (int i = 0; i < words.length; i++) {
//            System.out.print(words[i] + " ");
            words[i] = fs.next();
        }

        fr.close();

        System.out.println(print(words));

        int [][] x = new int[5][3];

        int counter = 0;
        for (int row = 0; row < x.length; row++) {
            for (int col = 0; col < x[row].length; col++) {
                x[row][col] = counter++;
            }
        }
        print(x);

    }

    public static void print(int [][] d2) {
        for (int row = 0; row < d2.length; row++) {
            for (int col = 0; col < d2[row].length; col++) {
                System.out.print(d2[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static int print(String [] s) {
        for (int i = 0; i < s.length; i++) {
//            System.out.print(s[i] + " ");
            for (int k = 0; k < s[i].length(); k++) {
                int c = s[i].charAt(k);
                System.out.print(c + " ");
//                System.out.print(s[i].charAt(k) + " ");
            }
            System.out.println();
        }
        System.out.println();
        return -17;
    }
}
