package Lab2_2;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysoperation2 {
    int[]x;
    int numofelement;

    public Arraysoperation2() {
        x = new int[5];
        numofelement=0;
    }
    public int add(int e)
    {
        if (numofelement<x.length)
        {
            x[numofelement]=e;
            numofelement++;
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        Arraysoperation2 test= new Arraysoperation2();
        Scanner in= new Scanner(System.in);

        System.out.println("input elements");

        for (int i = 0; i <7 ; i++) {
            if (test.add(in.nextInt())==0)
                System.out.println("added successfully");
            else
                System.out.println("array is full");

            System.out.println(Arrays.toString(test.x));
        }
    }
}

