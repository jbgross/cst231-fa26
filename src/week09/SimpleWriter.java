package week09;
import java.io.FileWriter;
import java.io.PrintWriter;

public class SimpleWriter {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("foo");
        PrintWriter pw = new PrintWriter(fw);
        pw.println("hello, world");

        fw.close();
    }
}
