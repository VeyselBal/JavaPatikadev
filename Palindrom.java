package java101;

import java.util.Scanner;

public class Palindrom {

    static boolean isPalindrom(int number) {

        int temp = number, reverseNumber = 0, mod;

        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return number == reverseNumber;
    }
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int number= inp.nextInt();
        System.out.println(isPalindrom(number));
    }

}
