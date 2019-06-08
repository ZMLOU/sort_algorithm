package com.tech.day;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int group = in.nextInt();
        while(group-- > 0){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[2 * n];
            for(int i = 0;i < 2 * n;i++){
                int tmp = i + 1;
                for(int j = 0;j < k;j++){
                    if(tmp <= n){
                        tmp = tmp * 2 - 1;
                    }else{
                        tmp = 2 * (tmp - n);
                    }
                }
                arr[tmp - 1] = in.nextInt();
            }
            if(arr.length > 0){
                System.out.print(arr[0]);
            }
            for(int i = 1;i < 2 * n ;i++){
                System.out.print(" " + arr[i]);
            }
            System.out.println();
        }
    }
}
