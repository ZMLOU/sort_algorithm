package com.tech.day;

import java.util.Scanner;

public class MagicPocket {
    static int[] weight;
    static int count = 0;
    public static void count(int s,int n){
        if(s == 0){
            count++;
            return;
        }
        if(s < 0 || n < 1){
            return;
        }
        count(s - weight[n],n - 1);
        count(s,n - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            weight = new int[n + 1];
            for(int i = 1;i <= n;i++){
                weight[i] = in.nextInt();
            }
            count(40,n);
            System.out.println(count);
        }
    }
}
