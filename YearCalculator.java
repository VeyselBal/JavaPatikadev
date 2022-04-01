package java101;

import java.util.Scanner;

public class YearCalculator {
    public static void main(String[] args) {
        //Kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.

        Scanner inp=new Scanner(System.in);
        System.out.print("Entered year : ");
        int year= inp.nextInt();

        if(year%4==0){
            if (year%100==0&& year%400!=0)
                System.out.println("Not leap year");
            else
                System.out.println("Leap year");
        }
        else
            System.out.println("Not leap year");
    }
}
