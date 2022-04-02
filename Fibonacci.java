package java101;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //Java döngüler ile fibonacci serisi bulan program yazıyoruz.

        Scanner inp = new Scanner(System.in);
        System.out.println("How many digit");
        int n = inp.nextInt();
        int x = 0;
        int y = 1;
        int temp;

        for (int i = 0; i <= n; i++) {
            System.out.print(" " + x);
            temp = x + y;
            x = y;
            y = temp;

        }
    }
}
