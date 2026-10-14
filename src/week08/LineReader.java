package week08;
import java.io.FileReader;
import java.util.Scanner;

public class LineReader {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("src/week08/input1.txt");
        Scanner fs = new Scanner(fr);

        int count = fs.nextInt();

        for (int i = 0; i < count && fs.hasNext(); i++) {
            String input = fs.next();
            if (i % 2 == 0) {
                System.out.println(input);
            }
//            System.out.println(fs.next());
        }

        fr.close();
    }
}
