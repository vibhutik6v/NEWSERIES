package JAVA;

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        
        /*int p=100;
        int r=5;
        int t=2;
        int  temp=(p*r*t)/100;
        System.out.println(temp);
        */
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();

        int temp=(p*r*t)/100;
        System.out.println("result :-"+ temp);


        



        }
}
