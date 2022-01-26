package Home_work_fattma;

import java.util.Arrays;

public class HW_2 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println("normal array :");
        System.out.println(Arrays.toString(arr));
        System.out.println("backup array :");
        int[]a=backup_array(arr);
        System.out.println(Arrays.toString(a));

    }
    public static int [] backup_array(int arr[]){
        int backup[]=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            backup[i]=arr[i];
        }
        return backup;
    }

}

