package com.tech.day;

import java.util.Scanner;

public class FabonacciNearly{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        if(n == 0 || n== 1){
            System.out.println(0);
        }else {
            while(c < n){
                a = b;
                b = c;
                c = a + b;
            }
            int result1 = n % b;
            int result2 = c % n;
            System.out.println(result1 < result2 ? result1 : result2);
        }
    }
}
