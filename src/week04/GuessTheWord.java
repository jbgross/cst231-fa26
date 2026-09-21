package week04;

import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
//        System.out.println(secret);
        String secret = "pokemon";

//        System.out.println(! true);
//        System.out.println(! false);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the secret word: ");
        String guess;
        guess = in.next();
        System.out.println(guess);

//        {
//            String name = "Jane";
//        }
//        System.out.println(name);

        int count = 1;
        while (! secret.equals(guess)) {
//            int count = 0;
            count++;
            System.out.println("wrong!");
            System.out.print("Enter the secret word: ");
            guess = in.next();
        }
        System.out.println("It took you " + count + " guesses");
        System.out.println("finally!");
    }
}
