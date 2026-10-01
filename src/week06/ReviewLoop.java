package week06;

import java.util.Random;
import java.util.Scanner;

public class ReviewLoop {
    public static void main(String[] args) {
        // print numbers 1 - 5
        int counter = 0;
        while (counter++ < 5) {
            counter++; // compiles the same as ++counter in its own statement
            System.out.print(counter + " ");
        }
        System.out.println();

        // password checker
        String password = "password1234";
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the password (it's " + password + "): ");
//        String guess = s.next();
//        if (guess.equals(password)) { // password.equals(guess)
//            System.out.println("Welcome");
//        } else {
//            System.out.println("Did you forget your password");
//        }

//        while ( ! guess.equalsIgnoreCase(password)) {
//            System.out.print("Enter the password (it's " + password + "): ");
//            guess = s.next();
//        }

        Random rand = new Random(-7);
        int number = (rand.nextInt() % 10) + 1;

        // write a loop that will continue until the user enter "yes" or "no"
        System.out.print("Enter yes or no: ");
        String answer = s.next();
//
//        if (answer.equals("yes") || answer.equals("no")) {
//            System.out.println("you entered a good value: " + answer);
//        } else {
//            System.out.println("you entered a bad value: " + answer);
//        }

        while ( ! (answer.equals("yes") || answer.equals("no")) ) {
            System.out.print("Enter yes or no: ");
            answer = s.next();
        }

        System.out.println();

        int min = 0;
        int max = 10;
        System.out.print("enter a number between " + min + " and " + max + ": ");
        int between = s.nextInt();

        if (between >= min && between <= max) {
            System.out.println("good number");
        } else {
            System.out.println("bad number");
        }

        while ( ! (between >= min && between <= max) ) {
//        while (between < min && between > max) {
            System.out.print("enter a number between " + min + " and " + max + ": ");
            between = s.nextInt();
//            if(between >= min && between <= max) {
//                System.out.println("You picked a good number!");
//            }
        }
        System.out.println("You picked a good number");


    }
}
