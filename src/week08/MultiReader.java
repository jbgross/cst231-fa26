package week08;
import java.io.FileReader;
import java.util.Scanner;

public class MultiReader {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/week08/multi.txt");
        Scanner in = new Scanner(fr);

        while (in.hasNext()) {
            in.next();
            String word = in.next();
            System.out.println(word);
        }
        System.out.println("done");
//        String word1 = in.next();
//        System.out.println(word1);
//
//        String word2 = in.next();
//        System.out.println(word2);

        fr.close();
    }
}
