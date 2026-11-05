package week11;

import java.util.Random;
import java.util.Scanner;

public class Review {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Random rand = new Random(-7);
        int min = 1;
        int max = 10;
        int count = 0;
        System.out.print("How many rounds: ");
        int rounds = in.nextInt();
        for (int roundCount = 0; roundCount < rounds; roundCount++) {
            int secret = getRandomNumberInRange(new Random(-7), max);
            int guess;
            do {
                System.out.print("Enter a number between " + min + " and " + max + ": ");
                guess = in.nextInt();
                count++;
            } while (guess != secret);
            System.out.println("It took you " + count + " guesses to guess correctly");
        }
        System.out.println("You're done");
    }

    /** get integer between 1 and max
     *
     */
    public static int getRandomNumberInRange(Random r, int max) {
        return Math.abs(r.nextInt() % max) + 1;
    }
}
