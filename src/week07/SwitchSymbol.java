package week07;

public class SwitchSymbol {
    public static void main(String[] args) {

        for (int k = 0; k < 6; k++) {
            for (int i = 0; i < 6; i++) {
                if (i % 2 != 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int k = 0; k < 6; k++) {
            char c = '+';
            for (int i = 0; i < 6; i++) {
                if (c == '*') {
                    c = '+';
                } else {
                    c = '*';
                }
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
