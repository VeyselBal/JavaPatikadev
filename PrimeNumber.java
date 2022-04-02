package java101;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

        Scanner inp=new Scanner(System.in);

        for (int i=2;i<100;i++){
            for (int j=2;j<=i;j++){
                if(i==j){
                    System.out.println(i);
                }
                else {
                    if (i%j==0)
                        break;
                }
            }
        }
    }
}
