package Arrays;


import java.util.Arrays;

public class HarmonicNumber {
    public static void main(String[] args) {

        double[] list={8,2,3,4,5,6,1,7};

        double result=0;

        for (int i= list.length-1;i>=0;i--){
            result+=1/list[i];
        }

        System.out.println(result);
    }

}
