package java101;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        /*Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
              *
             ***
            *****
           *******
          *********
           *******
            *****
             ***
              *
         */
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int score = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
                if (i == n)
                    score++;
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < score - 2; j++) {
                System.out.print("*");
            }
            System.out.println();
            score -= 2;
        }
    }
}
