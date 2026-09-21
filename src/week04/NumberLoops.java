package week04;

public class NumberLoops {
    public static void main(String[] args) {
        int counter = 0;

        while (counter < 5) {
//            System.out.println("counter: " + counter);
            System.out.print((counter + 1) + " ");
            counter++;
        }
        System.out.println();
        System.out.println("final value: " + counter);
    }
}
