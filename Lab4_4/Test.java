package Lab4_4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        circlrlarLinkedList<String> list=new circlrlarLinkedList<>();
        Scanner in = new Scanner(System.in);
        int choice=-1;
        System.out.println(" 1 add first\n" +
                "2 add last\n" +
                "3 remove first\n" +
                "4 rotate\n" +
                "0 exit");
        while (choice!=0)
        {
            System.out.print("your choice: ");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("input name");
                    list.addFirst(in.next());
                    System.out.println("first= "+list.first()+
                            "\tlast= "+list.Last()+"\tsize= "+list.size());
                    break;
                case 2:
                    System.out.print("input name");
                    list.addLast(in.next());
                    System.out.println("first= "+list.first()+
                            "\tlast= "+list.Last()+"\tsize= "+list.size());
                    break;
                case 3:
                    System.out.println("deleted name= "+list.remove());
                    System.out.println("first= "+list.first()+
                            "\tlast= "+list.Last()+"\tsize= "+list.size());
                    break;
                case 4:
                    list.rotate();
                    System.out.println("first= "+list.first()+
                            "\tlast= "+list.Last()+"\tsize= "+list.size());
                    break;
                case 0:
                    System.exit(0);
            }

        }
    }
}

