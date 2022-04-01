package java101;


import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int mat,phy,chemistry,turk,history,music;

        System.out.print("Math grade ");
        mat=input.nextInt();

        System.out.print("physics grade: ");
        phy=input.nextInt();

        System.out.print("Chemistry grade: ");
        chemistry=input.nextInt();

        System.out.print("Turkish grade: ");
        turk=input.nextInt();

        System.out.print("History grade: ");
        history=input.nextInt();

        System.out.print("music grade: ");
        music=input.nextInt();

        double total=mat+phy+chemistry+turk+history+music;
        double result=total/6;

        System.out.println( result >60 ? "Passed" : "Failed" );

    }

}
