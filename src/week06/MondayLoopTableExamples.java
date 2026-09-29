package week06;

public class MondayLoopTableExamples {
    public static void main(String[] args) {

        // loop tables
        // https://docs.google.com/document/d/12CL3S89kJn1sDRYYSPJcuMJ8Ko7ny--89AWg1PQPHXQ/edit?usp=sharing
        int x = 5;
//        while (x-- >= 0) {
        while (x > 0) {
            System.out.print(x + " ");
//            x = x - 1;
//            x -= 1;
            x--;
        }
        System.out.println();
        System.out.println("final value for x: " + x);
        int y = 5;
        while(--y > 0) {
            System.out.print(y + " ");
        }
        System.out.println();
        System.out.println("final value for y: " + y);

    }
}
