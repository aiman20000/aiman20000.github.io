package Lab1_1;

import java.util.Scanner;

public class Lab1ex4 {
    public static void main(String[] args) {

        int array[] = new int[5];
        System.out.println("enter the num:");
        enterarry(array);

        printarry(array);
    }
    public static void printarry(int[]x)
    {

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+"\t");

        }
    }
    public static void enterarry(int []y )
    {
        Scanner a = new Scanner(System.in);
        for (int i = 0; i <y.length; i++) {
            y[i] = a.nextInt();


        }
    }

    }

