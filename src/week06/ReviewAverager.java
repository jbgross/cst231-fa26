package week06;

import java.util.Scanner;

public class ReviewAverager {
    public static void main(String[] args) {
        // have user input numbers and sum until they enter
        // 0, then average (mean) that sum
        int input = 1, count = 0;
        Scanner in = new Scanner(System.in);
        int sum = 0;

        while (input != 0) {
            System.out.print("Enter a number (0 to quit): ");
            input = in.nextInt();
//            sum += input;
            sum = sum + input;
//            if(input != 0) {
                count++;
//            }
        }
        count--;

        System.out.println("you entered " + count + "numbers, not including the zero");
        double mean = (0.0 + sum) / count;
        System.out.println("the mean is " + mean);

    }
}
