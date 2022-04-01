package java101;
import java.util.Scanner;

public class LeastToGreatest {
    public static void main(String[] args) {
        //Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.

        Scanner inp=new Scanner(System.in);
        System.out.println("Enter three number");

        int x,y,z;
        x= inp.nextInt();
        y= inp.nextInt();
        z= inp.nextInt();

        if (x<y && x<z){
            if (y<z) System.out.println("x<y<z");
            else System.out.println("x<z<y");
        }
        else if (y<x && y<z){
            if (x<z) System.out.println("y<x<z");
            else System.out.println("y<z<x");
        }
        else{
            if (x<y) System.out.println("z<x<y");
            else System.out.println("z<y<x");
        }
    }
}
