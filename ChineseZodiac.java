package java101;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        // Kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your date of birth : ");
        int date = inp.nextInt();
        int number =date%12;

        switch (number) {
            case 0:
                System.out.println("Your  Chinese Zodiac : Monkey");
                break;
            case 1:
                System.out.println("Your  chinese Zodiac : Rooster");
                break;
            case 2:
                System.out.println("Your  chinese Zodiac : Dog");
                break;
            case 3:
                System.out.println("Your  chinese Zodiac : Pork");
                break;
            case 4:
                System.out.println("Your  chinese Zodiac : Mouse");
                break;
            case 5:
                System.out.println("Your  chinese Zodiac : Ox");
                break;
            case 6:
                System.out.println("Your  chinese Zodiac : Tiger");
                break;
            case 7:
                System.out.println("Your  chinese Zodiac : Rabbit");
                break;
            case 8:
                System.out.println("Your  chinese Zodiac : Dragon");
                break;
            case 9:
                System.out.println("Your  chinese Zodiac : Snake");
                break;
            case 10:
                System.out.println("Your chinese Zodiac : Horse");
                break;
            case 11:
                System.out.println("Your chinese Zodiac : Sheep");
                break;
        }
    }
}
