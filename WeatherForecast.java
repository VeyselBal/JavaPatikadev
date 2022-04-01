package java101;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        //koşullu ifadeler ile hava sıcaklığına göre etkinlik öneren program yapımı.

        Scanner inp=new Scanner(System.in);
        System.out.println("What is the temperature");
        int heat= inp.nextInt();

        if (heat>25) System.out.println("go to swimming");
        else if(heat>=15 && heat<25) System.out.println("Go to picnic");
        else if(heat>=5 && heat<15) System.out.println("Go to cinema");
        if (heat<5) System.out.println("go to Uludağ");

    }
}
