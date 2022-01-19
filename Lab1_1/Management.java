package Lab1_1;

import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Student [] teamm=new Student[3];
        /*
        Student s1=new Student(1,"aiman");
        teamm[0]=s1;
        Student s2=new Student(2,"amjad");
        teamm[1]=s2;
        Student s3=new Student(3,"asseel");
        teamm[2]=s3;
        */
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < teamm.length; i++) {
            Student s1=new Student(input.nextInt(),input.next());
            teamm[i]=s1;

        }
        for (int i = 0; i < teamm.length; i++) {
            System.out.println(teamm[i]);

        }
    }
}
