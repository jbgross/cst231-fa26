package week08;

import java.io.FileReader;
import java.util.Scanner;

public class OpenFile {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/week08/data.txt");
        Scanner fs = new Scanner(fr);
        String word = fs.next();
        System.out.println(word);

        fr.close();
    }
}
