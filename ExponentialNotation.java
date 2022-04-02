package java101;

import java.util.Scanner;

public class ExponentialNotation {
    public static void main(String[] args) {
        //döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int i;
        int j;

        for (i = 1, j = 1; i < n && j < n; i *= 4, j *= 5) {
            System.out.println(i + "   " + j);
        }
    }
}
