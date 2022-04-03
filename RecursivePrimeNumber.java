package java101;

import java.util.Scanner;

public class RecursivePrimeNumber {
    public static void main(String[] args) {
        //Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = inp.nextInt();
        int temp = n;

        System.out.println(recursive(n, temp));
    }

    static String recursive(int n, int temp) {
        if (n - 1 == 1) {
            return "prime number";
        }
        if (temp % (n - 1) == 0) {
            return "Not prime number";
        }

        return recursive(n - 1, temp);
    }

}
