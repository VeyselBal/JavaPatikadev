package java101;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        //Döngüler ile Klavyeden girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız

        Scanner inp =new Scanner(System.in);
        System.out.print("Enter number : ");
        int x= inp.nextInt();
        int total=0;
        int score=0;

        for (int i =1; i<x;i++){
            if (i%3==0&&i%4==0){
                total +=i;
                score++;
            }
        }
        System.out.println("Total : "+ total/score);
    }
}
