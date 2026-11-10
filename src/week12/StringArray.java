package week12;

import java.io.FileReader;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/week12/words.txt");
        Scanner in = new Scanner(fr);
        int count = in.nextInt();
//        System.out.println(count);

        String [] words = new String[count];
        print(words);
        for (int i = 0; i < count; i++) {
            words[i] = in.next();
        }
        print(words);

        fr.close();

    }

    public static void print(String [] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }


}
