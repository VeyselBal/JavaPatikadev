package java101;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        //Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

        Scanner inp = new Scanner(System.in);
        System.out.print("How many numbers you will enter : ");
        int n = inp.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + " number : ");
            int number = inp.nextInt();
            if (max < number) max = number;
            if (min > number) min = number;
        }
        System.out.println("MAx : " + max + "  MİN : " + min);
    }
}
