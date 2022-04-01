package java101;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıda ki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        System.out.println("Please enter your (meter)height ");
        double height= input.nextDouble();

        System.out.println("Please enter your weight");
        int weight= input.nextInt();

        double result= weight/(height*height);
        System.out.println(result );
    }
}
