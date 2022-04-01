package java101;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        // kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        Scanner input=new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5;

        System.out.print("Kaç kilo armut : ");
        int armutKilo= input.nextInt();

        System.out.print("Kaç kilo elma : ");
        int elmaKilo= input.nextInt();

        System.out.print("Kaç kilo domates : ");
        int domatesKilo= input.nextInt();

        System.out.print("Kaç kilo muz : ");
        int muzKilo= input.nextInt();

        System.out.print("Kaç kilo patlıcan : ");
        int patlicanKilo= input.nextInt();

        double toplam=(armut*armutKilo)+(elma*elmaKilo)+(domates*domatesKilo)+(muz*muzKilo)+(patlican*patlicanKilo);
        System.out.println("Toplam tutar : " + toplam);


    }
}
