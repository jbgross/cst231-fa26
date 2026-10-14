package week08;

import java.io.FileReader;
import java.util.Scanner;

public class TypeReader {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/week08/numbers.txt");
        Scanner fs = new Scanner(fr);

        int sum = 0;

        while(fs.hasNextInt()) {
            int number = fs.nextInt();
            sum += number;
        }

        fr.close();

        System.out.println("Sum: " + sum);
    }
}
