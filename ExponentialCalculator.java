package java101;

import java.util.Scanner;

public class ExponentialCalculator {
    public static void main(String[] args) {
        //kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

        Scanner inp = new Scanner(System.in);
        System.out.println("Üs alınacak sayı");
        int n = inp.nextInt();

        System.out.println("Üs olcak sayı");
        int r = inp.nextInt();
        int total=n;

        for (int i = 1; i < r; i++) {
            total*=n;
        }
        System.out.println("Total : " +total);
    }
}
