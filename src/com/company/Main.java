package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Task1();
        //Task2();
        //Task3();
    }

    private static void Task3() {
        Euclid result=new Euclid ( -10);
        System.out.println(result);
    }

    private static void Task2() {
        Money task= new Money(100, 27);
        System.out.println(task);
    }

    private static void Task1() {
        int summa =0;
        Scanner in = new Scanner(System.in);
        int vznos[] =new int[7];

        for(int i=0; i<7; i++)
        {
             vznos[i] = in.nextInt();
             summa+=vznos[i];

        }
        System.out.println("Внесли: "+ summa+" грн");
        Bank check= new Bank( summa);
        System.out.println(check);
    }
}
