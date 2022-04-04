package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NearestNumber {
    public static void main(String[] args) {
        //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number");
        int n = inp.nextInt();
        int min = 0;
        int max = 0;

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {

            if (list[i] > n) {

                max = list[i];
                min = list[i - 1];
                break;

            } else {
                max = list[0];
                min = list[0];
            }
        }
        System.out.println("Max number : " + max);
        System.out.println("Min number : " + min);
    }
    /*to get no errors

        for (int i = 0; i < list.length; i++) {

            if (list[i] > n) {
                if (n<list[0]){
                    max=list[0];
                    min=list[0];
                    break;
                }
                max = list[i];
                min = list[i - 1];
                break;

            } else {
                max = list[list.length-1];
                min = list[list.length-1];
            }
        }
     */
}
