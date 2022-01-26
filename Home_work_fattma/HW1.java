package Home_work_fattma;

import java.util.Arrays;

public class HW1 {
    public static void main(String[] args) {
        int []arr={10,12,13,14,15};
        System.out.println("Array before reversing :");
        System.out.println(Arrays.toString(arr));

        System.out.println("Array after reversing :");
        System.out.println(Arrays.toString(reverse(arr,arr.length)));

    }
    public static int[] reverse(int[] arr,int si) {
        int []arr2=new int[si];
        int j=si;
        for(int i=0;i<si;i++ ){
            arr2[j-1]=arr[i];
            j--;
        }
        return arr2;

    }
}

