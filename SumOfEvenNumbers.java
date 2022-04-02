package java101;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        //döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number");
        int total=0;

        while (true){
            int num= inp.nextInt();
            if (num%2==1) break;
            if(num%4==0) total+=num;
        }
        System.out.println("Total : "+total);
    }
}
