package java101;

import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args) {
        //Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number : ");
        int x = inp.nextInt();
        System.out.print("Exponent number : ");
        int n = inp.nextInt();

        System.out.println(recursive(x, n));
    }

    static int recursive(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * recursive(x, y - 1);
    }
}
