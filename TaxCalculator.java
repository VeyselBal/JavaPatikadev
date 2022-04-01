package java101;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int money=input.nextInt();

        System.out.println( money<1000 && money>0 ? money*1.18: money*1.08 );
    }
}
