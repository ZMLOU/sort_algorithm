package com.tech.day;

import java.util.Scanner;
public class LCM{
    public static int sum(int m,int n){
        if(m % n == 0){
            return n;
        }else{
            return sum(n,m % n);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int result = a * b /sum(a,b);
        System.out.println(result);
    }
}