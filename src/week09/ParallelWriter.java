package week09;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class ParallelWriter {

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

        FileWriter nameFile = new FileWriter("src/week09/names.txt", false);
        FileWriter scoreFile = new FileWriter("src/week09/scores.txt", false);

        PrintWriter nameWriter = new PrintWriter(nameFile);
        PrintWriter scoreWriter = new PrintWriter(scoreFile);

        while(true) {
            System.out.print("Enter name: ");
            String name = in.next();
            System.out.print("Enter score 1: ");
            int score1 = in.nextInt();
            if( score1 == 0) {
                break;
            }
            System.out.print("Enter score 2: ");
            int score2 = in.nextInt();
            nameWriter.println(name);
            scoreWriter.println(score1);
            scoreWriter.println(score2);
        }

        nameFile.close();
        scoreFile.close();
    }
}
