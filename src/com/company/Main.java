package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the table number");
        int table;

        Scanner obj =new Scanner(System.in);
        table =obj.nextInt();
        System.out.println("Table is");
        for(int i=0;i<=10;i++)
            System.out.println( table*i);

    }

}
