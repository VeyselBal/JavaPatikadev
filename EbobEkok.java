package java101;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        //Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int x = inp.nextInt();
        System.out.print("Enter  second number : ");
        int y = inp.nextInt();
        int i = 1;
        int ebob = 0, ekok = 0;


        while (x >= i) {
            if (x % i == 0 && y % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB : " + ebob);
        i = x;

        while (i < x * y) {
            if (i % x == 0 && i % y == 0) {
                ekok = i;
                System.out.println("EKOK : " + ekok);
                break;
            }
            i++;
        }
    }
}

