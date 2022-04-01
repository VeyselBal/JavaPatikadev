package java101;

import java.util.Scanner;

public class GradeCalculator2 {
        public static void main(String[] args) {
            //koşullu ifadeler ile kullanıcının not durumuna göre sınıfı geçme durumunu hesaplayan program yapımı.
            //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

            Scanner input=new Scanner(System.in);
            int mat,phy,chemistry,turk,history,music;
            int score=6;

            System.out.print("Math grade: ");
            mat=input.nextInt();
            if (mat<0 || mat>100) {
                score--;
                mat=0;
            }

            System.out.print("physics grade: ");
            phy=input.nextInt();
            if (phy<0 || phy>100) {
                score--;
                phy=0;
            }

            System.out.print("Chemistry grade: ");
            chemistry=input.nextInt();
            if (chemistry<0 || chemistry>100) {
                score--;
                chemistry=0;
            }

            System.out.print("Turkish grade: ");
            turk=input.nextInt();
            if (turk<0 || turk>100) {
                score--;
                turk=0;
            }

            System.out.print("History grade: ");
            history=input.nextInt();
            if (history<0 || history>100) {
                score--;
                history=0;
            }

            System.out.print("music grade: ");
            music=input.nextInt();
            if (music<0 || music>100) {
                score--;
                music=0;
            }

            double total=mat+phy+chemistry+turk+history+music;
            double result=total/score;

            System.out.println( result >55 ? "Passed: "+result : "Failed: "+result );

        }

    }
