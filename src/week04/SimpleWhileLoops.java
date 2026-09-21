package week04;

import java.util.Scanner;

public class SimpleWhileLoops {
    public static void main(String[] args) {
        System.out.println("flag 1");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the magic word: ");
        String magic = in.next();
//        while (magic == "secret") {
        while ( magic.equals("secret") ) {
            System.out.print("that's the secret word  ");
            System.out.println("flag 2");
        }

        System.out.println("flag 3");
    }
}
