package java101;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FlightsTickets {
    public static void main(String[] args) {
        //Uçak Bileti Fiyatı Hesaplayan Program

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the distance in km : ");
        int km = inp.nextInt();

        System.out.print("How old are you : ");
        int age = inp.nextInt();

        System.out.print("(One way => 1 , two way => 2) : ");
        int way = inp.nextInt();

        if (km > 0 && age > 0 && (way == 1 || way == 2)) {

            if (age < 12 && way == 2)
                System.out.println("Total : " + ((km * way * 0.1) / 2) * 0.8);
            else if (age < 12)
                System.out.println("Total : " + (km * way * 0.1) / 2);

            if (age < 24 && age > 12 && way == 2)
                System.out.println("Total : " + ((km * way * 0.1) * 0.9) * 0.8);
            else if (age < 24 && age > 12)
                System.out.println("Total : " + (km * way * 0.1) * 0.9);

            if (age <= 65 && age >= 24 && way == 2)
                System.out.println("Total : " + (km * way * 0.1) * 0.8);
            else if (age <= 65 && age >= 24)
                System.out.println("Total : " + (km * way * 0.1));

            if (age > 65 && way == 1)
                System.out.println("Total : " + ((km * way * 0.1) * 0.7) * 0.8);
            else if (age > 65)
                System.out.println("Total : " + (km * way * 0.1) * 0.7);

        } else
            System.out.println("You entered wrong datas ");
    }
}