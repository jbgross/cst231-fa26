package week11;

import java.io.FileReader;
import java.util.Scanner;

public class ReviewFileIO {
    public static void main(String[] args) throws Exception {
        readNames2("src/week11/names.txt");
//        FileReader fr = new FileReader("src/week11/names.txt");
//        readNames(fr);
//        Scanner s = new Scanner(fr);
//        int nameCount = s.nextInt();
//        for (int i = 0; i < nameCount && s.hasNext(); i++) {
//            String name = s.next();
//            System.out.println("Name " + (i + 1) + ":" + name);
//        }
//        System.out.println("done");
//        fr.close();
    }

    public static int readNames2(String filename) throws Exception {
        FileReader fr = new FileReader(filename);
        Scanner s = new Scanner(fr);
        int nameCount = s.nextInt();
        int i;
        for (i = 0; i < nameCount && s.hasNext(); i++) {
            String name = s.next();
            System.out.println("Name " + (i + 1) + ":" + name);
        }
        System.out.println("done");
        fr.close();
        return i;
    }

    public static void readNames(FileReader fr) {
        Scanner s = new Scanner(fr);
        int nameCount = s.nextInt();
        for (int i = 0; i < nameCount && s.hasNext(); i++) {
            String name = s.next();
            System.out.println("Name " + (i + 1) + ":" + name);
        }
        System.out.println("done");
    }

}
