package java101;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class AreaOfTriangle {
    public static void main(String[] args) {

        //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Scanner input = new Scanner(System.in);
        int a,b,c;

        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();

        int u=(a+b+c)/2; // perimeterOfTriangle

        double areaOfTriangle=sqrt(u * (u - a)* (u - b) * (u - c));
        System.out.println(areaOfTriangle);

    }
}
