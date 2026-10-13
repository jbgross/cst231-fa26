package week07;

public class NestedLoopExamples {
    public static void main(String[] args) {

        int max = 5;
        int count = 1;
        int rowCounter = 1;
        while (rowCounter <= max) {
            while (count <= max) {
                System.out.print("* ");
                count++;
            }
            count = 1;
            rowCounter++;
            System.out.println();
        }

        System.out.println();

        for (int row = 0; row < max; row++) {
            for (int col = 0; col < max; col++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
