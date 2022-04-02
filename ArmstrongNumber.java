package java101;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = inp.nextInt();
        int total = 0;

        while (number != 0) {
            int x = number % 10;
            total += x;
            number /= 10;
        }
        System.out.println("Total : " + total);
    }
}
