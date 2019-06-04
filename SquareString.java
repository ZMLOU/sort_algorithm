package com.tech.day;

import java.util.Scanner;

public class SquareString {
    public static void main(String[] args){
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        String c = sin.next();
        for(int i = 0;i < n;i++){
            System.out.print(c);
        }
        System.out.println();
        for(int i = 1;i <= Math.ceil((double)n / 2 - 2);i++){
            System.out.print(c);
            for(int j = 1;j < n - 1;j++){
                System.out.print(" ");
            }
            System.out.print(c);
            System.out.println();
        }
        for(int i = 0;i < n;i++){
            System.out.print(c);
        }
    }
}
