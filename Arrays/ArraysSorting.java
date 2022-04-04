package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSorting {
    public static void main(String[] args) {
        //Dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

        Scanner inp = new Scanner(System.in);
        System.out.print("Arrays dimensional : ");
        int n = inp.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < list.length; i++) {
            System.out.print(i+1 + ". number ");
            list[i] = inp.nextInt();
            System.out.println();
        }
        int temp;

        Arrays.sort(list);
/*
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
*/
        for (int i : list) {
            System.out.println(i + " ");
        }
    }
}
