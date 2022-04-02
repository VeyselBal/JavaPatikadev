package java101;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        //Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulun

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = inp.nextInt();
        int total = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total += i;
            }
        }
        if (total == n) System.out.println("Perfect number");
        else System.out.println("Not perfect number ");
    }
}
