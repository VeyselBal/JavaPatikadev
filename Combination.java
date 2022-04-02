package java101;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        //Java ile kombinasyon hesaplayan program yazınız.

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter first number x : ");
        int x = inp.nextInt();
        System.out.print("Enter second number y : (x>=y) => ");
        int y = inp.nextInt();
        int a = x - y;
        int n = 1, r = 1, b = 1;

        for (int i = 1; i <= x; i++) {
            n *= i;
        }
        for (int i = 1; i <= y; i++) {
            r *= i;
        }
        for (int i = 1; i <= a; i++) {
            b *= i;
        }
        System.out.println("y combination of x : " + n / (r * b));
    }
}
