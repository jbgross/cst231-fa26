package week02;

import java.util.Random;

// code for Monday
//import java.util.Random;
public class MethodsRandomMath {
    static int z;

    public static void main(String[] args) {
        // datatypes
        // int whole numbers
        int x;
//        System.out.println(z);
        x = 10;
        int y = 5;
        // double double precision floating point - decimal numbers
        double a;
        double b = 5.5;
        double c = 5;
        double u = b * c;
//        int d = 5.0;
        double v = x * y;
        double w = x * b;
//        int e = x * b;
        // String series or sequence of character
        String studentName = "Hector Ramirez";
        String emptyStudentName = "";
        // metasyntactic variables
        double foo, bar;
        foo = 9.0;
        double sqrtFoo = Math.sqrt(foo);
        System.out.println(sqrtFoo);
        bar = 3.2;
        double barSquared = Math.pow(bar, 2);
        System.out.println(barSquared);

        double min = Math.min(b, Math.pow(b, 2));
        int max = Math.max(5, 7);

        Random rand = new Random(-7);
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt());

        int secret1 = Math.abs(rand.nextInt()) % 10;
        System.out.println(secret1);

    }
}
