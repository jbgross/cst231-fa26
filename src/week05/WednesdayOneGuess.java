package week05;

import java.util.Random;
import java.util.Scanner;

public class WednesdayOneGuess {
    public static void main(String[] args) {
        Random rand = new Random(-7);
        Scanner in = new Scanner(System.in);

        int secret = Math.abs(rand.nextInt() % 10) + 1;
        System.out.println("the secret number is " + secret);

        System.out.print("Enter a number 1-10: ");
        int guess = in.nextInt();
        System.out.println("the user's guess is " + guess);

        if (guess == secret) {
            System.out.println("guess is correct");
        } else {
            System.out.println("guess is incorrect");
        }


    }
}
