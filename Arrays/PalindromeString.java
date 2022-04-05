package Arrays;

import java.util.Scanner;

public class PalindromeString {

    static String reverse(String wordle) {
        String reverse = "";
        for (int i = wordle.length() - 1; i >= 0; i--) {
            reverse += wordle.charAt(i);
        }
        return reverse;
    }

    static boolean isPalindrome(String wordle,String str){
        if (wordle.equals(str)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        //Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.

        Scanner inp=new Scanner(System.in);
        System.out.println("Enter wordle");
        String str=inp.nextLine();

        String wordle=reverse(str);

        if (isPalindrome(wordle , str)){
            System.out.println(str +" == "+wordle+" Palindrome.");
        }else{
            System.out.println(wordle+" != "+str +" not Palindrome");
        }
    }
}
