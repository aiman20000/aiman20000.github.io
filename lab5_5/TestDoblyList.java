package lab5_5;

import java.util.Scanner;

public class TestDoblyList {
    public static void main(String[] args) {
        doublyLinkedList<String>list=new doublyLinkedList<>();
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int choice=-1;
            System.out.println("your choice: ");
            choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("input name :");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.println("input name :");
                    list.addLast(in.next());
                    break;
                case 3:
                    System.out.println("delet name :"+ list.removeFirst());
                    break;
                case 4:
                    System.out.println("delet name :"+ list.removeLast());
                    break;






            }
            System.out.println("first= "+ list.first()+"\t last="+list.Last()+"\t size= "+ list.size());


        }
    }
}
