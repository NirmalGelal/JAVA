package com.company;


import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int array[] = new int[5];

        Scanner scan = new Scanner(System.in);
        for(int i=0;i< array.length;i++){
            System.out.print("a["+i+"] = ");
            array[i] = scan.nextInt();
        }
        for (int num:array) {
            System.out.print(num + " ");
        }
    }
}
