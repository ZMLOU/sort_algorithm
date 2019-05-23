package com.tech.day;

import java.util.Scanner;

public class Pool{
    public static int pool(int n){
        int sum = 0;
        while(n > 2){
            int temp = n % 3;
            int result = n / 3;
            n = temp + result;
            sum += result;
        }
        if(n == 2){
            sum += 1;
        }
        return sum;
    }
    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            if(n >= 2){
                System.out.println(pool(n));
            }
        }
    }
}