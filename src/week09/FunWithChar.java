package week09;

public class FunWithChar {
    public static void main(String[] args) {
        char c = 'f';
        int i = 'f';
        char c2 = 68;
        System.out.print(c2);
        char c3 = 9;
        System.out.print(c3);
        System.out.print(c2);
        System.out.println();
        System.out.println(i);
        System.out.println(c2);
        System.out.println((int) c2);
        for (int k = 'A'; k < 'Z'; k++ ) {
            System.out.print((char) k + " ");
        }
        System.out.println();
        for (char k = 'A'; k < 'Z'; k++ ) {
            System.out.print(k + " ");
        }
        System.out.println();
    }
}
