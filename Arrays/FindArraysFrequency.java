package Arrays;

import java.util.Arrays;

public class FindArraysFrequency {

    static boolean isCheck(int[] duplicate, int value) {
        for (int i : duplicate) {
            if (i == value) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20,8,5,10,20,5,8};

        int[] duplicate = new int[list.length];

        int count = 0;
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                }
            }
            if (isCheck(duplicate, list[i])) {
                duplicate[startIndex++] = list[i];
                System.out.println(list[i] + " sayıs " + count + " defa tekrar edildi");
            }
            count = 0;
        }
    }
}