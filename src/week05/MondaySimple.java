package week05;

import java.util.Random;

public class MondaySimple {
    public static void main(String[] args) {
        Random r = new Random();
//        int x = Math.abs(r.nextInt()) % 11;
        int x = 5;
        System.out.println(x);

        if (x > 5) {
            System.out.println("big");
        } else if (x < 0) {
            System.out.println("negative");
        } else {
            System.out.println("small");
        }

        System.out.println("done");
    }
}
