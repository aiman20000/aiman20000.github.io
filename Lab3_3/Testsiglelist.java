package Lab3_3;

import java.util.Scanner;

public class Testsiglelist {
    public static void main(String[] args) {
        SingleLinkedList<String> numList=new SingleLinkedList<>();
        Scanner in=new Scanner(System.in);
        //numList.addFrist(1);
       // numList.addLast(2);
        //numList.addFrist(0);

        for (int i = 0; i < 5; i++) {
            numList.addLast(in.next());

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(numList.removefirst()+"\t");

        }
        System.out.println("size of list="+numList.size());
        System.out.println("first of list="+numList.first());
        System.out.println("last of list="+numList.last());

    }
}
