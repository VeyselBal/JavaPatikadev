package java101;

import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {
        //Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = inp.nextInt();
        int score=0;

        recursive(number,score);
    }

    static int recursiveRevers(int n,int score){
        score--;
        if (score==0) {
            System.out.print(n);
            return 0;
        }
        System.out.print(n+" ");
        return recursiveRevers(n+5,score);
    }

    static int recursive(int n,int score) {
        score++;
        if (n <= 0) {
            return recursiveRevers(n,score);
        }
        System.out.print(n + " ");
        return recursive(n - 5,score);
    }
}
