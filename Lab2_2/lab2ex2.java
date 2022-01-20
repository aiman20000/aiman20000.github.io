package Lab2_2;

import java.util.Arrays;

public class lab2ex2 {
    public static void main(String[] args) {
        int[]x={11,12,13,14,15};
        System.out.println(Arrays.toString(x));
        System.out.println("after shift left");
        System.out.println(Arrays.toString(shiftleft(x)));

    }
    public static int[] shiftleft(int[]a)
    {
        int t=a[0];
        for (int i = 0; i < a.length-1 ; i++) {
            a[i]=a[i+1];

        }
        a[a.length-1]=t;
        return a;

    }
}
