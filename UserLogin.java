package java101;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args){
        /*
           Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse
           yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise
           ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
        */

        Scanner inp=new Scanner(System.in);
        System.out.println("User passaword :");
        int pw= inp.nextInt();

        if (pw == 1234)
            System.out.println("Sisteme girdiniz");
        else {
            System.out.println("Şifreyi yanlış girdiniz sıfırlamak ister misiniz? isterseniz 1'e istemezseniz 0' basın");
            byte sonuc = inp.nextByte();

            if (sonuc==1)
            {
                System.out.println("Yeni şifrenizi girin");
                int sifre = inp.nextInt();

                while (true)
                {
                    if (sifre == 1234 || sifre == pw)
                    {
                        System.out.println("Şifre oluştulamadı tekrar deneyin");
                    }

                    else
                    {
                        System.out.println("Şifre oluşturuldu");
                        break;
                    }
                    System.out.println("Yeni şifrenizi girin");
                    sifre = inp.nextInt();

                }
            }
        }
    }
}
