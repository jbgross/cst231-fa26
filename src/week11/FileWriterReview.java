package week11;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriterReview {

    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("out.txt");
        PrintWriter pw = new PrintWriter(fw);
        Scanner in = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter number: ");
            number = in.nextInt();
            if (number % 2 == 0 && number != 0) {
                pw.println(number);
            }
        } while(number != 0);

        fw.close();
    }
}
