package com.tech.day;

import java.util.Scanner;

public class HungerYi {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long[] arr = new long[3];
        long mol = 1000000007;
        arr[0] = in.nextLong() % mol;
        arr[1] = (4 * arr[0] + 3) % mol;
        arr[2] = (4 * arr[1] + 3) % mol;
        int minMax = 100000;
        int step = 0;
        long cur = 0;
        for(int i = 0;i < 3;i++){
            cur = arr[i];
            step = i;
            while(cur != 0 && step < minMax){
                cur = (cur * 8 + 7) % mol ;
                step++;
            }
            minMax = step <= minMax ? step : minMax;
        }
        if(minMax < 100000){
            System.out.println(minMax);
        }else{
            System.out.println(-1);
        }
    }
}
