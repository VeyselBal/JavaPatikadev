package java101;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        //Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

        Scanner inp = new Scanner(System.in);
        System.out.println("How many digit?");
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (n - i) * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
