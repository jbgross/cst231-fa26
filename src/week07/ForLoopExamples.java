package week07;

public class ForLoopExamples {
    public static void main(String[] args) {

        int max = 10;
        int count = 0;
        while (count < max) {
            count++;
            System.out.print(count + " ");
        }
        System.out.println();
        System.out.println("Final value for count: " + count);

        int i;
        for (i = 0;
             i < max;
             i++) {
            System.out.print(i + " ");

            if(i == 5) {
                continue;
            }
//            System.out.println("hello");
        }
        System.out.println();
        System.out.println("Final value for i: " + i);

        int count2 = 1;
        while (count2 <= max) {
            System.out.print(count2 + " ");

            if (count2 == 5) {
                continue;
            }

            count2++;
        }
        System.out.println();
    }
}
