package Lab2_2;

import java.util.Arrays;

public class lab2ex3 {
    public static void main(String[] args) {
        int[]x={11,12,13,14,15};
        System.out.println(Arrays.toString(x));
        System.out.println("after shift left");
        System.out.println(Arrays.toString(rightshift(x)));
    }
    public static int[] rightshift(int[]a)
    {
        int t=a[a.length-1];
        for (int i = a.length-1; i >0 ; i--) {
            a[i]=a[i-1];

        }
        a[0]=t;
        return a;

    }
}
