package week10;

import java.io.FileReader;
import java.util.Scanner;

public class MoreMethods {
    public static void main(String[] args) throws Exception {
        int x = 5;
//        doubleNumber('q');
        doubleNumber(x + 10);
        int y = square(x);
        System.out.println(square(7));
        System.out.println(x + square(9));
        FileReader fr = openFileForReading("src/week10/test.txt");
        Scanner fileScanner = new Scanner(fr);
//        Scanner fileScanner = openFileForReading("src/week10/test.txt");
//        Scanner fileScanner = new Scanner(openFileForReading("src/week10/test.txt"));
//        String data = openFileForReading("src/week10/test.txt").next();
//        System.out.println();
        while(fileScanner.hasNext()) {
            System.out.println(fileScanner.next());
        }

        fr.close();
    }

    public static FileReader openFileForReading(String filename) throws Exception {
//        return null;
        FileReader fr = new FileReader(filename);
//        Scanner sr = new Scanner(fr);
//        fr.close();
        return fr;
    }

    public static int square(int base) {
        return base * base;
    }

    public static void doubleNumber(int number) {
        System.out.println("Double of " + number + " is " + number + number);
        System.out.println("Double of " + number + " is " + (number + number));
    }
}
