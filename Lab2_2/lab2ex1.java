package Lab2_2;

import java.util.Arrays;

public class lab2ex1 {
    public static void main(String[] args) {
        int[]x={11,12,13,14,15};
        System.out.println(Arrays.toString(x));
        System.out.println("after reverse");
        System.out.println(Arrays.toString(reverse(x)));

    }
    public static int[] reverse(int[]a)
    {
        int t;
        int n= a.length-1;
        for (int i = 0; i < a.length/2 ; i++) {
            t=a[i];
            a[i]=a[n];
            a[n]=t;
            n--;

        }
        return a;
    }
}
