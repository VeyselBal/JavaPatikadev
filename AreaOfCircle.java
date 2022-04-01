package java101;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Yarıçapı r, merkez açısısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        double pi=3.14;
        int r= input.nextInt();  // radius
        int a=input.nextInt();  // angle

        double result=(pi*(r*r)*a)/360;

        System.out.println(result);
    }

}
