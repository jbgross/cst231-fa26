package week03;

import java.util.Scanner;

public class CompoundConditionDeMorgansLaw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userNumber = in.nextInt();
        System.out.println(userNumber);

        if (userNumber > 0 && userNumber <= 10) {
            System.out.println("good number");
        } else {
            System.out.println("bad number ");
        }
    }
}
