package java101;

import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number");
        double n = inp.nextInt();
        double result=0;

        while (n!=0){
            result +=(1/n);
            n--;
        }
        System.out.println(result);
    }
}
